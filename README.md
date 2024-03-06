# shopee-be-eureka-demo

# Option 1
# Run docker
# Step 0 run file jar
mvn install -DskipTests -Dmaven.test.skip=true

# Step 1 build
docker build . -t quannguyen1999/shopee-be-eureka-demo
# or
mvn spring-boot:build-image (reject - buildpack to slow)
# or
mvn compile jib:dockerBuild (use this - google job fastest)


# Step 2 run
docker run -d -p 8082:8082 quannguyen1999/shopee-be-eureka-demo
# or to get log
docker run --name shopee-be-account-demo -p 8070:8070 quannguyen1999/shopee-be-account-demo


# Command run Rabbit MQ
docker run --name active-mq-test --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3-management

# Command run postgres
docker run --name postgres -p 5431:5432 POSTGRES_PASSWORD=postgres -d postgres