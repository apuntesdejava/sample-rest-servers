// tag::comment[]
/*******************************************************************************
 * Copyright (c) 2017, 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
 // end::comment[]
package it.io.openliberty.guides.rest;

import java.util.Properties;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EndpointIT {
    
    private static final Jsonb jsonb = JsonbBuilder.create();

    // tag::test[]
    @Test
    // end::test[]
    public void testPing() {
        // tag::systemProperties[]
        String port = System.getProperty("http.port");
        String context = System.getProperty("context.root");
        // end::systemProperties[]
        String url = "http://localhost:" + port + "/" + context + "/";

        // tag::clientSetup[]
        Client client = ClientBuilder.newClient();
        // end::clientSetup[]

        // tag::target[]
        WebTarget target = client.target(url + "/ping");
        // end::target[]
        // tag::requestget[]
        Response response = target.request().get();
        // end::requestget[]

        // tag::assertequals[]
        assertEquals("Incorrect response code from " + url, 
                     Response.Status.OK.getStatusCode(), response.getStatus());
        // end::assertequals[]

        // tag::body[]
        String msg = response.readEntity(String.class);

        // tag::assertosname[]
        assertEquals("no se obtuvo el texto",
                     "Hola",
                     msg);
        // end::assertosname[]
        // end::body[]
        response.close();
    }
}
