빌더 패턴: 객체를 유연하고 직관적으로 생성할 수 있기 때문에 개발자들이 애용하는 디자인 패턴
즉, 빌더 패턴을 사용하면 어느 필드에 어떤 값이 들어가는지 명시적으로 파악할 수 있다.
```java
// 빌더 패턴을 사용하지 않았을 때
new Article("abc", "def");

// 빌더 패턴을 사용했을 때
Article.builder().title("abc").content("def").build();
```
빌더 패턴을 사용하지 않으면 abc는 어느 필드에 들어가는 값인지, def는 어디 필드에 들어가는 값인지 파악하기 어렵다.
하지만 빌더 패턴을 사용하면 어느 필드에 어느 값이 매칭되는지 바로 보이므로 객체 생성 코드의 가독성을 높인다.
그리고 @Builder 애너테이션을 사용하면 빌더 패턴을 사용하기 위한 코드를 자동으로 생성하므로 간편하게 빌더 패턴을 사용해 객체를 만들 수 있다.

