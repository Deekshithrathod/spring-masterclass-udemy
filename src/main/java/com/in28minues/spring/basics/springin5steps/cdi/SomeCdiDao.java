package com.in28minues.spring.basics.springin5steps.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class SomeCdiDao {
    public SomeCdiDao(){
        System.out.println("SomeCdi dao");
    }
}
