package com.codecool.people;

public class Mentor extends Person {
    private String nickName;
    private String city;
    private int favNum;

    public Mentor(int id, String firstName, String lastName, String phoneNumber, String email, String nickName, String city, int favNum) {
        super(id, firstName, lastName, phoneNumber, email);
        this.nickName = nickName;
        this.city = city;
        this.favNum = favNum;
    }
}
