package com.company;

public class Contacts {
    private String surname;
    private long number;

    public Contacts(String surname, long number) {
        this.surname = surname;
        this.number = number;

    }


    public String getSurname() {
        return surname;
    }

    public long getNumber() {
        return number;
    }
}
