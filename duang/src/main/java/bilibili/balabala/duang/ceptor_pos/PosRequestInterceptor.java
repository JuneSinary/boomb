package bilibili.balabala.duang.ceptor_pos;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class PosRequestInterceptor implements HandlerInterceptor {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        // 在请求处理完成后进行拦截处理
        System.out.println("PosRequestInterceptor: " + request.getRequestURI());
        // 可以添加响应头、修改响应内容等
    }
}