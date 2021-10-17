package org.polovtsev;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Profiling
public class Quoter implements Quote {

    private String message;

    public Quoter() {
        System.out.println("phase 1");
    }

    @PostConstruct
    public void init(){
        System.out.println("phase 2");
        System.out.println(repeat);
    }

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayQuote(){
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
