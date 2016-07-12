package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */

    @Autowired
    private TaskExecutor taskExecutor;

    @Autowired
    private AsyncProcessor asyncProcessor;

    @GET
    @Path("{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public void getIt(@PathParam("id") final String id, @Suspended final AsyncResponse asyncResponse) {
        taskExecutor.execute(asyncProcessor.schedule(asyncResponse, id));
    }
}
