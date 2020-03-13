package com.apuntesdejava.endpoint;

import io.helidon.common.CollectionsHelper;
import java.util.Set;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@ApplicationScoped
public class JAXRSConfiguration extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return CollectionsHelper.setOf(PersonEndpoint.class);
    }

}
