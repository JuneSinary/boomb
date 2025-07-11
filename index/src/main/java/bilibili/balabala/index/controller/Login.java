package bilibili.balabala.index.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @PostMapping("/login")
    String login(String username, String password) {
        // 这里可以添加登录逻辑，比如验证用户名和密码
        if ("admin".equals(username) && "password".equals(password)) {
            return "登录成功";
        } else {
            return "登录失败，用户名或密码错误";
        }
    }
}
