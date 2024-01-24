package springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootdeveloper.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
