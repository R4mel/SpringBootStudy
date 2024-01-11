package springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springbootdeveloper.domain.Article;
import springbootdeveloper.dto.AddArticleRequest;
import springbootdeveloper.repository.BlogRepository;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // 해당 클래스를 빈으로 서블릿 컨테이너에 등록
public class BlogService {
    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
