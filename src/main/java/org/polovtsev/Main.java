package org.polovtsev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
    }

    @Bean
    public Quoter quote() {
        Quoter quote = new Quoter();
        quote.setMessage("hello");
        return quote;
    }

//    @Bean
//    public ProfilingAnnotationBeanPostProcessor profilingAnnotationBeanPostProcessor() throws Exception {
//        return new ProfilingAnnotationBeanPostProcessor();
//    }

}
