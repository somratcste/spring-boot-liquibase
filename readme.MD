# Spring Boot Maven Liquibase 
This project shows how to maintain database version control using liquibase with spring boot and maven. 

## Command for Liquibase 
To update the database based on your changes 
```
mvn liquibase:update 
```

For rollback on your changes 
```
mvn liquibase:rollback -Dliquibase.rollbackCount=1
```
Here rollbackCount the number you can use based on which version you want to go back. 