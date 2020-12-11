FROM openjdk:11
RUN cat /etc/resolv.conf
VOLUME /tmp
EXPOSE 8888
ADD ./target/hr-config-server-*.jar hr-config-server.jar
ENTRYPOINT ["java", "-jar", "-Dhttp.sslVerify=false", "/hr-config-server.jar"]