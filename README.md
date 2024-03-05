# shopee-be-eureka-demo
# Option 1
# Run docker
# Step 0 run file jar
mvn install -DskipTests -Dmaven.test.skip=true

# Step 1 build
docker build . -t quannguyen1999/shopee-be-eureka-demo
> or
> mvn spring-boot:build-image

# Step 2 run
docker run -d -p 8082:8082 quannguyen1999/shopee-be-eureka-demo