#!/bin/bash
#基于oraclejdk8
FROM frolvlad/alpine-oraclejdk8:slim
#FROM frolvlad/alpine-oraclejdk8-temporary
# 指定运行生成的镜像的工作目录
WORKDIR /data/docker/project/onlinecar-schedule
#设置时区
RUN rm -rf /etc/localtime && ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
# 复制jar包到docker镜像的中‘WORKDIR’指定的目录下，如果不复制则别的机器上运行docker pull下来的 镜像时会提示‘Error: Unable to access jarfile xxx.jar’
COPY onlinecar-schedule.jar onlinecar-schedule-docker.jar

#容器启动后执行的操作
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "onlinecar-schedule-docker.jar"]
#ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "delivery-order.jar >/home/jenkins/project/delivery-order/logs/delivery-order.log 2>&1 &"]
#CMD java -jar delivery-order.jar
