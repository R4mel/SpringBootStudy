package springbootdeveloper.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import springbootdeveloper.repository.BlogRepository;

@SpringBootTest // 테스트용 애플리케이션 생성
@AutoConfigureMockMvc // MockMvc 생성
class BlogApiControllerTest {
    @Autowired
    protected MockMvc mockMvc; // HTTP 통신을 위한 테스트

    @Autowired
    protected ObjectMapper objectMapper; // 직렬화, 역직렬화를 위한 클래스
    // 직렬화: 자바 객체 -> JSON(<-> 역직렬화)

    @Autowired
    private WebApplicationContext context;

    @Autowired
    BlogRepository blogRepository;

    @BeforeEach // 테스트 실행 전 실행하는 메서드
    public void setMockMvc() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();

        blogRepository.deleteAll();
    }
}