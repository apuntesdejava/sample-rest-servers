/*
 * Copyright 2020 diego.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.apuntesdejava.endpoint;

import com.apuntesdejava.endpoint.request.PersonRequest;
import com.apuntesdejava.model.Person;
import com.apuntesdejava.service.PersonService;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author diego
 */
@Path("/person")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@ApplicationScoped
public class PersonEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonEndpoint.class);

    @Inject
    private PersonService personService;

    @POST
    public Response create(PersonRequest request) {
        Person p = personService.create(request);
        return Response.ok(p).build();
    }

    @GET
    public Response findAll() {
        List<Person> list = personService.findAll();
        return Response.ok(list).build();

    }
}
