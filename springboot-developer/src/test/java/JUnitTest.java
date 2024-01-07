import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1 + 2는 3이다") // 테스트 이름 애너테이션
    @Test // 테스트 수행 메서드 애너테이션
    public void junitTest() {
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(a + b, sum); // 값이 같은지 확인
    }
    /*
    JUnit은 테스트끼리 영향을 주지 않도록 각 테스트를 실행할 때마다
    테스트를 위한 실행 객체를 만들고 테스트가 종료되면 실행 객체를 삭제
    */
}
