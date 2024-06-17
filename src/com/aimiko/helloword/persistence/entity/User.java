package com.aimiko.helloword.persistence.entity;

public class User {

    private int id;
    private String name;
    private int password;

    public User() {

    }

    @Override
    public String toString() {
        return STR."\{id}\{name}\{password}";
    }
}
