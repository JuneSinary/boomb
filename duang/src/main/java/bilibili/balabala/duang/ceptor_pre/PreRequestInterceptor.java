package bilibili.balabala.duang.ceptor_pre;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class PreRequestInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // 在请求处理之前进行拦截处理
        System.out.println("PreRequestInterceptor: " + request.getRequestURI());
        // 进行token验证、权限检查等
        return true; // 返回true才会继续执行
    }
}