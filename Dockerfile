# build stage
FROM naartjie/alpine-lein AS build-env
ADD . /src
RUN cd /src && lein uberjar

# final stage
FROM anapsix/alpine-java
WORKDIR /app
COPY --from=build-env /src/target/i-am-groot-standalone.jar /app/
CMD java $JVM_OPTS -cp i-am-groot-standalone.jar clojure.main -m iamgroot.core
