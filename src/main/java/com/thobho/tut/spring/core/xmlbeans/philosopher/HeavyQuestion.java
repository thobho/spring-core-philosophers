package com.thobho.tut.spring.core.xmlbeans.philosopher;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class HeavyQuestion implements InitializingBean {

    private String question;

    public HeavyQuestion(String question) {
        this.question = question;
    }

    public HeavyQuestion() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @PostConstruct
    public void init() {
        System.out.println("post construct:" + question);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set: " + question);
    }
}
