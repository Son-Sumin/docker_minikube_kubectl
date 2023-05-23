# helloheroku
- Heroku test를 위한 임시 프로젝트입니다

* * *

- Eclipse-github 연결된 계정 확인   
  상단 Window > Proferences > Git > Configuration   
  
 ### 스프링부트 배포   
 - Springboot + JPA + Gradle + Thymeleaf + MySQL   

- eclipse   
프로젝트 파일 우클릭 > system.properties 파일 생성   
```
- system.properties 작성 내용
java.runtime.version=사용하는 java 버전
```

- cmd
```
- jar 파일 생성
 .\gradlew build
```

- eclipse  
(선택) Port 바인딩
Heroku는 port를 자동으로 지정해주는데 port를 고정하고 싶다면 application.properties에 아래 내용 작성
```
- application.properties에 바인딩하고 싶은 포트번호 작성
...
server.port=${port:8080}
...
```

 
프로젝트 파일 우클릭 > Procfile 파일 생성   
```
- Procfile jar 관련 옵션 작성 내용 
web: java -Dserver.port=$PORT $JAVA_OPTS -jar build/libs/boardstudy-0.0.1-SNAPSHOT.jar

- 다른 옵션 설정 필요 없을 경우
web: java -jar build/libs/boardstudy-0.0.1-SNAPSHOT.jar
```


<참고 사이트>
https://devcenter.heroku.com/articles/java-support
