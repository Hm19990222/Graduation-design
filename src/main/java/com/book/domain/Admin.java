package com.book.domain;

public class Admin {

    private int adminId;
    private String password;


    public static void main(String[] args) {
        new Book();
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public int getAdminId() {
        return adminId;
    }
}
