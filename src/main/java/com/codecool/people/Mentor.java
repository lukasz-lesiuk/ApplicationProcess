package com.codecool.people;

public class Mentor extends Person {
    private String nickName;
    private String city;
    private Integer favNum;

    public Mentor(int id, String firstName, String lastName, String phoneNumber, String email, String nickName, String city, int favNum) {
        super(id, firstName, lastName, phoneNumber, email);
        this.nickName = nickName;
        this.city = city;
        this.favNum = favNum;
    }

    public String getNickName() {
        return nickName;
    }

    public String getCity() {
        return city;
    }

    public int getFavNum() {
        return favNum;
    }

    public String printMentor() {
        StringBuilder mentorString = new StringBuilder();
        mentorString.append(id);
        mentorString.append(", ");
        mentorString.append(firstName);
        mentorString.append(", ");
        mentorString.append(lastName);
        mentorString.append(", ");
        mentorString.append(nickName);
        mentorString.append(", ");
        mentorString.append(phoneNumber);
        mentorString.append(", ");
        mentorString.append(email);
        mentorString.append(", ");
        mentorString.append(city);
        mentorString.append(", ");
        mentorString.append(favNum);

        return mentorString.toString();
    }
}
