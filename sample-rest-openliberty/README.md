# Run
```
mvn clean liberty:create package liberty:run
```


# Call
```
http :9080/sample-rest-openliberty/properties 
http :9080/sample-rest-openliberty/person
 http --json :9080/sample-rest-openliberty/person firstName=Jhon lastName=Doe email=juan@perez.com
```