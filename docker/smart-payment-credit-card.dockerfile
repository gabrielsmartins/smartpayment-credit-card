FROM maven:3.6-jdk-11
MAINTAINER Gabriel Martins
ENV NODE_ENV=production
ENV PORT=8080
COPY . /app
WORKDIR /app
RUN mvn clean install
ENTRYPOINT ["mvn", "spring-boot:run"]