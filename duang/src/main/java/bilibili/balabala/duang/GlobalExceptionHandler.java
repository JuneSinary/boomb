package bilibili.balabala.duang;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@Configuration
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ModelAndView handleInternalError(Exception ex) {
        ModelAndView mav = new ModelAndView("error"); // 渲染error.ftl
        mav.addObject("status", "666");
        mav.addObject("message", "自定义错误信息");
        // 记录日志等操作
        return mav;
    }
}