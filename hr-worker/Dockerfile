FROM openjdk:11
VOLUME /tmp
EXPOSE 8001
ADD ./target/hr-*-*.jar hr-worker.jar
ENTRYPOINT ["java", "-jar", "-Dhttp.sslVerify=false", "/hr-worker.jar"]