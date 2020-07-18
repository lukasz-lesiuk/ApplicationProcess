package com.codecool.people;

public class Applicant extends Person {
    private int applicationCode;

    public Applicant(int id, String firstName, String lastName, String phoneNumber, String email, int applicationCode) {
        super(id, firstName, lastName, phoneNumber, email);
        this.applicationCode = applicationCode;
    }
}
