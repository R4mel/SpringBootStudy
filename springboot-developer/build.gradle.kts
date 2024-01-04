plugins {
    id("java")
    id("org.springframework.boot") version("3.0.2")  // 스프링부트 플러그인
    id("io.spring.dependency-management") version("1.1.0") // 의존성 관리, 스프링 의존성 관리
}

group = "" // 지정한 그룹 이름
version = "1.0-SNAPSHOT"
java.sourceCompatibility = org.gradle.api.JavaVersion.VERSION_17 // 자바 버전

repositories {
    mavenCentral() // 의존성을 받을 저장소
}

dependencies { // 의존성 입력
    implementation("org.springframework.boot:spring-boot-starter-web") // 웹관련 기능
    testImplementation("org.springframework.boot:spring-boot-starter-test") // 테스트 기능
}

tasks.test {
    useJUnitPlatform()
}