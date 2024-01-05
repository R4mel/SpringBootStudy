package springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 부트 사용에 필요한 기본 설정을 해줌
public class SpringBootDeveloperApplication { // 자바의 main() 메서드
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
        // 매개변수 1: 스프링 부트 3 애플리케이션의 메인 클래스로 사용할 클래스
        // 매개변수 2: 커맨드 라인의 인수
    }
}

