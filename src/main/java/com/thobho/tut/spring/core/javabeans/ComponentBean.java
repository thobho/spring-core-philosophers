package com.thobho.tut.spring.core.javabeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComponentBean {

    @Autowired
    @Qualifier("simpleString")
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }


}
