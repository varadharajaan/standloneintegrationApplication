FROM java:8

# Install maven

FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY --from=clone /app/spring-petclinic /app
RUN mvn install

# Adding springboot-elk app to container
ADD . /usr/config-client
WORKDIR /usr/config-client
RUN ["mvn", "install"]

EXPOSE 8085
CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "target/*.jar"]