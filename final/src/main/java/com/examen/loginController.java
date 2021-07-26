package com.examen;

import java.util.List;
import java.util.ArrayList;
import com.examen.Login;


public class loginController {
    List<Login> users;

    public loginController(){
        this.users = new ArrayList<Login>();
    }

    boolean login(String username, String password){
        Login user = new Login(username,password);

        if(user.login()){
            if(users.size() < 50){
                users.add(user);
                return true;
            }
        }
        return false;

    }

    boolean logout(String username, String password){

        users.remove(1); //solo para mantener 50 usuarios conectados

        return true;


    }
    
}
