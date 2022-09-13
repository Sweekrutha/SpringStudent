FROM openjdk:17
LABEL maintainer="com.Springboot"
ADD target/SpringbootStudent-0.0.1-SNAPSHOT.jar SpringbootStudent.jar
ENTRYPOINT ["java","-jar", "SpringbootStudent.jar" ]
