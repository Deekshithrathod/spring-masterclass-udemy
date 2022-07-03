package com.in28minues.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeService {
    @Value("${external.service.url}")
    private String serviceURL;

    public String getServiceURL(){
        return serviceURL;
    }
}
