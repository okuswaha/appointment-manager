package com.prakash.config;

import com.prakash.resource.PatientResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by okuswaha on 1/9/2017.
 */
@Configuration
public class Config extends ResourceConfig{
    public Config(){
        register(PatientResource.class);
    }
}
