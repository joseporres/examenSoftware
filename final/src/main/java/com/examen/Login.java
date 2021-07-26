package com.examen;
import java.io.Console;
import java.util.*;


public class Login {
    String user;
    String password;

    public Login(){};

    public Login(String user, String password){
        this.user = user;
        this.password = password;
    }

    public boolean login(){
        if(user.equals(password.reverse())){
            return true;
        }
        return false;
    }
}