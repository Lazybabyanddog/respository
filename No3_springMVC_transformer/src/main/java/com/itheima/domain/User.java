package com.itheima.domain;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class User {

    private String username;
    private String password;
    private Date birthday;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

  /*  public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
*/
 /*   @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", account=" + account +
                '}';
    }*/
}
