FROM openjdk:11
WORKDIR /src
COPY . .
# RUN command -v java && java --version
# ENTRYPOINT ["java", "-jar", "target/my-app.jar"]
RUN javac -d /out demo/Demo.java
WORKDIR /out
CMD ["java","demo.Demo"]
