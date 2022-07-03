package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDaoComponentScan {

    @Autowired
    JdbcConnectionComponentScan jdbcConnection;

    public JdbcConnectionComponentScan getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnectionComponentScan jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
