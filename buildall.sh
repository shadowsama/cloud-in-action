cd eureka/
   mvn clean package docker:build -Dmaven.test.skip=true
cd ../eureka-repetion/
   mvn clean package docker:build -Dmaven.test.skip=true
cd ../cloud-config/
   mvn clean package docker:build -Dmaven.test.skip=true
cd ../city/
   mvn clean package docker:build -Dmaven.test.skip=true
cd ../weather-service
   mvn clean package docker:build -Dmaven.test.skip=true
cd ../weather
   mvn clean package docker:build -Dmaven.test.skip=true

