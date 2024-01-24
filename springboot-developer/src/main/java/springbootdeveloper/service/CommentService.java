package springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springbootdeveloper.domain.Comment;
import springbootdeveloper.dto.AddCommentRequest;
import springbootdeveloper.repository.CommentRepository;

@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public Comment save(AddCommentRequest request){
        return commentRepository.save(request.toEntity());
    }
}
