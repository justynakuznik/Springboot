package com.pierwszaaplika.springbootaplikacja;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//kiedy taka adnotacja to oznacza że klasa to BIN
@Component
public class DatabaseConnection {
    @Value("localhost")
    private String host;
    @Value("Justyna")
    private String username;
    @Value("password")
    private String password;

    public void addUserToDatabase(String name){
        System.out.println("User added to db");
    }
}
