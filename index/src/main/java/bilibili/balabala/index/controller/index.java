package bilibili.balabala.index.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {

    @GetMapping("/666")
    String rt_some(){
        return "操你妈，你妈逼！";
    }
}
