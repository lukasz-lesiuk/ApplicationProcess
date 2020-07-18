package com.codecool.people;

public abstract class Person {

    public int id;
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;

    public Person(int id, String firstName, String lastName, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

}
