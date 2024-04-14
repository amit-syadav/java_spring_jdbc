
# A simple java spring project with mysql connection

A project to brush upon on java, java spring, mysql , docker , ubuntu 



## How to run locally

Docker should be installed. The application is dockerised, so we need not clone it
    
    # get the docker files from git 
    wget https://raw.githubusercontent.com/amit-syadav/java_spring_jdbc/main/Dockerfile.jdk
    wget https://raw.githubusercontent.com/amit-syadav/java_spring_jdbc/main/Dockerfile.mysql 
    wget https://raw.githubusercontent.com/amit-syadav/java_spring_jdbc/main/create_student_table.sql   


    # to create images on your local system

    docker build -t javaspring-mysql -f ./Dockerfile.mysql .
    docker build -t javaspring-jre -f ./Dockerfile.jdk .


    # create a docker network so our spring application can communicate with mysql
    docker network create my-net


    # create containers

    docker run --name mysql --network my-net -p 3306:3306 -d -e MYSQL_ROOT_PASSWORD=amit1234 javaspring-mysql   
    docker run --name jre --network my-net -d javaspring-jre tail -f /dev/null 


    # execute the main jar file

    docker exec jre  java -jar java_spring_jdbc/mysql/target/mysql-0.0.1-SNAPSHOT-jar-with-dependencies.jar


    # connect with the running mysql container to check the inserted records

    docker exec -it mysql mysql  -u root -p
    use springjdbc;
    select * from student;


    # stop the containers

    docker stop jre
    docker stop mysql







## Acknowledgements

 - https://readme.so/editor


## Todo
create a docker-compose file
