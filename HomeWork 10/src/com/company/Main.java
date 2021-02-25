package com.company;

public class Main {

    public static void main(String[] args) {
        Words words1 = new Words();
        words1.isWords();

        System.out.println("\n****Телефонная книга****");
        Phonebook phonebook = new Phonebook();
        phonebook.isPhonebook();
    }

}
