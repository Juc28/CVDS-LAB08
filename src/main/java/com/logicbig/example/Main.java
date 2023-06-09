package com.logicbig.example;

import com.logicbig.example.data.MyConfiguration;
import com.logicbig.example.data.MyConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;
import java.util.Arrays;

@SpringBootApplication
public class Main{
    @Autowired
    MyConfigurationService myConfigurationService;

    public static void main (String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean(name = "database")
    public CommandLineRunner run() throws Exception {
        return (args) -> {
            System.out.println("Adding Configuration....\n");
            myConfigurationService.addConfiguration(new MyConfiguration("premio","2000"));

            System.out.println("\nGetting all configs....");
            myConfigurationService.getAllConfiguration().forEach(configuration -> System.out.println(configuration));
        };
    }

    @Bean
    @DependsOn({"database"})
    ServletRegistrationBean jsfServletRegistration (ServletContext servletContext) {
        //spring boot only works if this is set
        servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());

        //registration
        ServletRegistrationBean srb = new ServletRegistrationBean();
        srb.setServlet(new FacesServlet());
        srb.setUrlMappings(Arrays.asList("*.xhtml"));
        srb.setLoadOnStartup(1);
        return srb;
    }
}