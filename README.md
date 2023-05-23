# helloheroku
- Heroku test를 위한 임시 프로젝트입니다
<br>

* * *
<br>
  
 ### 프로젝트 배포      
 - **Springboot + JPA + Gradle + Thymeleaf + MySQL**   
   - 프로젝트 생성 방법1   
     ![springboot initializer](https://github.com/Son-Sumin/helloheroku/assets/114986832/7687c405-2ec9-4a3f-a0bc-cce8731beabb)
   - 프로젝트 생성 방법2  
     ![스프링부트 프로젝트](https://github.com/Son-Sumin/helloheroku/assets/114986832/9e28489f-dab6-4a23-bfad-f16338a754cc)   
     ![스프링부트 dependencies](https://github.com/Son-Sumin/helloheroku/assets/114986832/5d9158d7-0bf4-42f4-ae97-57a06f758430)


<br>

- (참고) Eclipse-github 연결된 계정 확인   
  상단 Window > Proferences > Git > Configuration   
<br>

- system.properties 파일 생성
  - eclipse   
    - 프로젝트 파일 우클릭 > system.properties 파일 생성   
      ```
        - system.properties 작성 내용
        java.runtime.version=사용하는 java 버전
      ```

  - cmd
    ```
    - jar 파일 생성
     .\gradlew build
    ```
<br>

- (선택) Port 바인딩
  - eclipse  
    - Heroku는 port를 자동으로 지정해주는데 port를 고정하고 싶다면 application.properties에 아래 내용 작성
      ```
      - application.properties에 바인딩하고 싶은 포트번호 작성
      ...
      server.port=${port:8080}
      ...
      ```
<br>

- Procfile 파일 생성   
  - eclipse 
    - 프로젝트 파일 우클릭 > Procfile 파일 생성   
      ```
      - Procfile jar 관련 옵션 작성 내용 
      web: java -Dserver.port=$PORT $JAVA_OPTS -jar build/libs/boardstudy-0.0.1-SNAPSHOT.jar

      - 다른 옵션 설정 필요 없을 경우
      web: java -jar build/libs/boardstudy-0.0.1-SNAPSHOT.jar
      ```
      <br><br>
      <br><br>
      
![자료1](https://github.com/Son-Sumin/helloheroku/assets/114986832/9200c26f-cb0a-482d-923e-c03d19af04b5)


<br><br>

<참고 사이트>   
https://devcenter.heroku.com/articles/java-support
