package com.sopovs.moradanen.jaxws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.sun.xml.ws.transport.http.servlet.WSSpringServlet;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@ImportResource("webServiceContext.xml")
public class JaxWsTestApplication {

    @Bean
    public ServletRegistrationBean zkLoader() {
        ServletRegistrationBean zkLoader = new ServletRegistrationBean(new WSSpringServlet(),
                "/web-services/fooBarService");
        return zkLoader;
    }

    public static void main(String[] args) {
        SpringApplication.run(JaxWsTestApplication.class, args);
    }
}
