package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by ssolnosky on 7/7/2016.
 */
@ApplicationPath("resources")
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(MyResource.class);
    }
}
