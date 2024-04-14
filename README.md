
# A simple java spring project with mysql connection

A project to brush upon on java, java spring, mysql , docker , ubuntu 


Ho


## How to run

Docker should be installed. The application is dockerised

    # to create images on your local system

    docker build -t jdk -f ./Dockerfile.mysql .
    docker build -t jdk -f ./Dockerfile.jdk .


    # create a docker network so our spring application can communicate with mysql
    docker network create my-net


    # create containers
    docker run --name jre --network my-net -d javaspring-jre tail -f /dev/null
    docker run --name mysql --network my-net -p 3306:3306 -d -e 


    # execute the main jar file
    docker exec jre  java -jar java_spring_jdbc/mysql/target/mysql-0.0.1-SNAPSHOT-jar-with-dependencies.jar


    # connect with the running mysql container to check the inserted records
    docker exec -it mysql /bin/sh
    use springjdbc;
    select * from student;


# java_spring_jdbc
