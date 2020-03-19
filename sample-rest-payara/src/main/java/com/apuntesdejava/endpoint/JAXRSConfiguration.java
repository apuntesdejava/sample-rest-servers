package com.apuntesdejava.endpoint;

import javax.annotation.sql.DataSourceDefinition;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@DataSourceDefinition(
        name = "java:app/MyApp/MyDS",
        className = "com.mysql.cj.jdbc.MysqlDataSource",
        url = "jdbc:mysql://localhost/sample",
        user = "sample",
        password = "sample",
        properties = {"fish.payara.log-jdbc-calls=true","serverTimezone=America/Lima","useSSL=false","allowPublicKeyRetrieval=true"}
)
@ApplicationPath("/")
public class JAXRSConfiguration extends Application {

}
