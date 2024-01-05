package springbootdeveloper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController { // 사용자가 /test GET 요청을 하면 "Hello, world!" 문자열을 리턴
    @GetMapping("/test") // /test는 @GetMapping이라는 애너테이션으로 메서드와 매핑할 때 스프링 부트에서 설정한 경로
    public String test() {
        return "Hello, world!";
    }
}