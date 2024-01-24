package springbootdeveloper.dto;

import lombok.Getter;
import springbootdeveloper.domain.Comment;

@Getter
public class CommentListViewResponse {
    private final Long id;
    private final String content;
    private final Long recommend;

    public CommentListViewResponse(Comment comment) {
        this.id =comment.getId();
        this.content = comment.getContent();
        this.recommend = comment.getRecommend();
    }
}
