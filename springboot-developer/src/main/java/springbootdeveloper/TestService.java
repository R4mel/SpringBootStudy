package springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService { // Service(비즈니스 계층)
    @Autowired // MemberRepository 빈 주입
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll(); // 멤버 목록 얻기
    }
}
