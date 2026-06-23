package kr.hs.kr.cicd_springboot_01;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    private int k = 1;
    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }
}
