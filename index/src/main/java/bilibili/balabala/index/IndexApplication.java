package bilibili.balabala.index;

import jakarta.annotation.PostConstruct;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.security.Security;

@ComponentScan({"bilibili.balabala.index", "bilibili.balabala.index.controller",
        "bilibili.balabala.index.config", "bilibili.balabala.jiligulu",
        "bilibili.balabala.pupupu", "bilibili.balabala.duang",
        "bilibili.balabala.duang.ceptor_pos", "bilibili.balabala.duang.ceptor_pre", "bilibili.balabala"
})
@MapperScan({"bilibili.balabala.pupupu.mapper"})
@SpringBootApplication
public class IndexApplication {

    @PostConstruct
    void registerBouncyCastle() {
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(IndexApplication.class, args);
    }

}
