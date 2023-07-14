package com.example.fly_messenger;

public class Users {
    String profilepic,mail,username,password,userId,lastmsg,status;

    public Users() {
        // Default constructor with no arguments
    }

    Users (String userId, String username, String maill, String password, String profilepic, String status){

        /*step 2 after registration code set ids manually*/
        this.userId = userId;
        this.username = username;
        this.mail = maill;
        this.password = password;
        this.profilepic = profilepic;
        this.status = status;

    }
    /*step 1
    * use generate option using right click for getter and setter
    * select all using swift */

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastmsg() {
        return lastmsg;
    }

    public void setLastmsg(String lastmsg) {
        this.lastmsg = lastmsg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
