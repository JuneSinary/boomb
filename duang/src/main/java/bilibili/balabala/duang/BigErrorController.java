package bilibili.balabala.duang;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Configuration
public class BigErrorController implements ErrorController {
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
        // 从请求获取错误状态码
        Integer status = (Integer) request.getAttribute("javax.servlet.error.status_code");
        // 传递数据到error.ftl
        model.addAttribute("status", status);
        model.addAttribute("message", "喵喵喵，喵喵喵，喵喵喵喵喵~~~");
        return "error"; // 返回error.ftl
    }
}