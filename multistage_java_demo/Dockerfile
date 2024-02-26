FROM openjdk:11 as base
WORKDIR /src
COPY . .
RUN javac -d /out demo/Demo.java
WORKDIR /out

FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=base /out/demo/*.class ./demo/ 
CMD ["java","demo.Demo"]
