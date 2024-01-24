package springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "recommend", nullable = false)
    private Long recommend;

    @Builder
    public Comment(String content){
        this.content = content;
    }
}


/*
엔티티 구성
아이디 not null 기본 키 bigint
내용 not null varchar 255
추천 수 not null start = 0 bigint
 */