package springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
    // 엔티티 Article과 엔티티의 PK 타입 Long을 인수로 넣는다.
}
