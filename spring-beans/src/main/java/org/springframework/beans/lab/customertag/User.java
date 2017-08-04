package org.springframework.beans.lab.customertag;

/**
 * Created by sunyinjie on 2017/8/4.
 */
public class User {
    private String userName;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{\"User\":{"
                + "\"userName\":\"" + userName + "\""
                + ",\"email\":\"" + email + "\""
                + "}}";
    }
}
