package com.apuntesdejava.endpoint;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@ApplicationScoped
@ApplicationPath("/")
public class JAXRSConfiguration extends Application {

}
