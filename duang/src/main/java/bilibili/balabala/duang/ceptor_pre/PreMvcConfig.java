package bilibili.balabala.duang.ceptor_pre;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PreMvcConfig implements WebMvcConfigurer {
    private final PreRequestInterceptor preRequestInterceptor;

    public PreMvcConfig(PreRequestInterceptor preRequestInterceptor) {
        this.preRequestInterceptor = preRequestInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(preRequestInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/error");
    }
}