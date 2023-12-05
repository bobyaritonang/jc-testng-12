package com.juaracoding;

public class User {
    private String username;

    private String password;
    private String pesanError = "Invalid username 0r password";

    public String getPesanError(){
        return pesanError;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // buat function boolean checkLogin()
    public boolean checkLogin(){
        if (username.equals(getUsername())&&
                password.equals(getPassword())){
            return true;
        }else {
            return false;
        }
    }
}
