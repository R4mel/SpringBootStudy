package springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import springbootdeveloper.service.CommentService;

@RequiredArgsConstructor
@Controller
public class CommentApiController {
    private final CommentService commentService;

}
