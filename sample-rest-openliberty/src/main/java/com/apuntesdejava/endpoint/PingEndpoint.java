package com.apuntesdejava.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

/**
 *
 * @author Diego Silva Limaco <diego.silva at apuntesdejava.com>
 */
@Path("ping")
public class PingEndpoint {

    @GET
    @Produces(TEXT_PLAIN)
    public String ping() {
        return "Hola";
    }
}
