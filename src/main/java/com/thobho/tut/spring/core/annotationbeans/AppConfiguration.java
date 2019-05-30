package com.thobho.tut.spring.core.annotationbeans;

import com.thobho.tut.spring.core.xmlbeans.philosopher.HeavyQuestion;
import com.thobho.tut.spring.core.xmlbeans.philosopher.Philosopher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AppConfiguration {

    @Bean
    public Philosopher createPolishPhilosopher(){
        return new Philosopher("Janusz", createQuestion(), new ArrayList<>());
    }

    @Bean
    public HeavyQuestion createQuestion(){
        return new HeavyQuestion("is this java config?");
    }

    @Bean(name = "simpleString")
    public String createSimpleStringBean(){
        return "Spimle stirng";
    }

    @Bean(name = "anotherSimpleString")
    public String createAnotherSimpleStringBean(){
        return "Another Simple String";
    }

}
