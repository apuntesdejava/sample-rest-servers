# Build
```
mvn clean package payara-micro:bundle 
```
mvn clean package && docker build -t com.apuntesdejava.payara/sample-rest-payara .

# RUN
```
 java -jar .\target\sample-rest-payara-microbundle.jar
 ```

docker rm -f sample-rest-payara || true && docker run -d -p 8080:8080 -p 4848:4848 --name sample-rest-payara com.apuntesdejava.payara/sample-rest-payara 

# CALL
## List
```
http :8080/person
```

## New record
```
http --json :8080/person firstName=John lastName=Doe email=john@doe.com
```
