# ClientServer

Java Client-Server application which transfer objects of clients to server and after that to Postgres DB. 

### Technologies
- Java
- PostrgreSQL

### How to run
```sh
To launch firstly class Main.java in Server part. Than to launch class Main.java in Client part
```

###Database describtion 
Connection is established through JDBC. Postgre database initialized with some sample user. The model of entity in DB:
| ID | NAME | BILL |
| -----------| ------ | ------ |


###Usage example
Interaction between server and client is conducted through the console

```sh
##Client side:
Insert ID:
1
Insert NAME:
Mike
Insert BILL:
15
```

```sh
##Server side:
Got object: |Id - 1|  |Name - Mike|  |Bill - 15|
```

##Client side:
-------INFO from Server-------
Server got instance
```
