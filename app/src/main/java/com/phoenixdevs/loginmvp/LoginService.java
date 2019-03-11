package com.phoenixdevs.loginmvp;

class LoginService {


    public boolean login(String username, String password) {

        if(username.equals("hossein") && password.equals("akbari")) return true;
        else return false;
    }
}
