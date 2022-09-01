package com.pierwszaaplika.springbootaplikacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private DatabaseConnection databaseConnection;

    //dzieki tej adnotacji spring wstrzyknie zaleznosc z BIN
    @Autowired
    public UserService(DatabaseConnection databaseConnection){
        this.databaseConnection = databaseConnection;
    }

    public void registerUser(String name){
        databaseConnection.addUserToDatabase(name);
    }
}
