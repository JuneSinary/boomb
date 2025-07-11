package bilibili.balabala.jiligulu;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;
import java.security.Security;
import java.util.*;
import java.util.stream.Collectors;

@Configuration
@RestController
@RequestMapping("/api/crypto")
public class Version {

    @GetMapping("/provider-info")
    public Map<String, Object> getProviderInfo() {
        // 获取 Bouncy Castle 提供者
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);

        Map<String, Object> response = new TreeMap<>();

        if (provider == null) {
            response.put("error", "BouncyCastle provider not registered");
            return response;
        }

        // 基础信息
        response.put("providerName", provider.getName());
        response.put("version", provider.getVersion());
        response.put("info", provider.getInfo());
        response.put("className", provider.getClass().getName());

        // 获取所有支持的算法服务
        Map<String, List<String>> servicesMap = new TreeMap<>();
        Set<Provider.Service> services = provider.getServices();

        services.stream()
                .sorted(Comparator.comparing(Provider.Service::getType))
                .forEach(service -> {
                    String type = service.getType();
                    String algorithm = service.getAlgorithm();

                    servicesMap.computeIfAbsent(type, k -> new ArrayList<>())
                            .add(algorithm);
                });

        response.put("services", servicesMap);

        // 获取安全属性
        Map<String, String> properties = provider.stringPropertyNames()
                .stream()
                .collect(Collectors.toMap(
                        key -> key,
                        provider::getProperty,
                        (v1, v2) -> v1,  // 合并函数（避免重复键）
                        TreeMap::new
                ));

        response.put("properties", properties);

        return response;
    }
}