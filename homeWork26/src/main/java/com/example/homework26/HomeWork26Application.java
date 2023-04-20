package com.example.homework26;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class HomeWork26Application implements WebApplicationInitializer {

    public static void main(String[] args) {
        SpringApplication.run(HomeWork26Application.class, args);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

    }
}
