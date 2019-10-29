FROM amazoncorretto:11
EXPOSE 8090
COPY . /app
RUN /app/ci/build.sh

CMD java -jar app.jar
