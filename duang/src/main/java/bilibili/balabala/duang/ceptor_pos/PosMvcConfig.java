package bilibili.balabala.duang.ceptor_pos;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PosMvcConfig implements WebMvcConfigurer {
    private final PosRequestInterceptor posRequestInterceptor;

    public PosMvcConfig(PosRequestInterceptor posRequestInterceptor) {
        this.posRequestInterceptor = posRequestInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(posRequestInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/error");
    }
}