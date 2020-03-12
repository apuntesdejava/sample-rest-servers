package com.apuntesdejava.endpoint;

import javax.annotation.sql.DataSourceDefinition;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@DataSourceDefinition(
        name = "java:app/MyApp/MyDS",
        className = "org.h2.jdbcx.JdbcDataSource",
        url = "jdbc:h2:file:./data/sample",
        properties = {"fish.payara.log-jdbc-calls=true"}
)
@ApplicationPath("/")
public class JAXRSConfiguration extends Application {

}
