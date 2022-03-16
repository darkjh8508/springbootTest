# springbootTest
스프링부트 샘플

# 스프링부트 환경설정 셋팅
1. Ctrl + Shift + P 클릭
2. Spring Initializr: Create a Gradle Project
3. spring boot version : 2.6.4
4. 프로젝트 언어 : java
5. 패키지 설정 : com.xxxxx.xxxx
6. 프로젝트명 이름 설정
7. 빌드 설정 : jar
8. java version : 11
9. 라이브러리 설정
10. 프로젝트 경로 설정  

# Gradle 필요한 유틸리티
# Thymeleaf
implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'

# SWAGGER
implementation 'io.springfox:springfox-boot-starter:3.0.0'
implementation 'io.springfox:springfox-swagger-ui:3.0.0'

# JPA
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'

# Model Mapper
implementation group: 'org.modelmapper', name: 'modelmapper', version: '3.0.0'

# spring boot 실행 하다가 에러가 발생할경우
- documentationPluginsBootstrapper 이라고 나올경우 아래에 application.properties 추가
>> # 라이브러리 추가 오류(swagger 포함) 발생방지
spring.mvc.pathmatch.matching-strategy=ant-path-matcher