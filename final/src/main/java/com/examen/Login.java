package com.examen;


public class Login {
    String user;
    String password;

    public Login(){};

    public Login(String user, String password){
        this.user = user;
        this.password = password;
    }

    public boolean login(){
        StringBuilder reversePass = new StringBuilder();
        reversePass.append(password);
        if(user.equals(reversePass.reverse().toString())){
            return true;
        }
        return false;
    }

}