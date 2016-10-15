#city : 8081
#config: 8888
#eureka: 8761,8762
#weather: 80
#server:port :8084
#weather                                             latest                 62e1f78a7f0a        2 minutes ago       244.5 MB
#weather-service                                     latest                 461612822de3        3 minutes ago       242.8 MB
#city                                                latest                 78578e3f9cfd        3 minutes ago       219 MB
#cloud-config                                        latest                 99d2f5b0dbf5        3 minutes ago       248.5 MB
#eureka-repetion                                     latest                 8c439f241d12        4 minutes ago       249.6 MB
#eureka                                              latest                 cf10f66e30ed        4 minutes ago       249.6 MB

docker run -d -p 8761:8761 eureka
sleep 10s
docker run -d -p 8762:8762 eureka-repetion
sleep 10s
docker run -d -p 8888:8888 cloud-config
sleep 10s
docker run -d -p 8084:8084 weather-service
sleep 10s
docker run -d -p 80:80 weather
