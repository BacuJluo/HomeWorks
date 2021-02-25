package com.company;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    public void isPhonebook(){
        List<Contacts> list = new ArrayList<>();
        add("Чертков", 87012434066L, list);
        add("Тимошенко", 87051154498L, list);
        add("Вишневская", 89083543218L, list);
        add("Распутина", 87775645125L, list);
        add("Михаленко", 89083202971L, list);
        add("Вишневская", 89083465132L, list);
        add("Чертков", 89451235432L, list);

        System.out.println(get("Вишневская", list));
    }

    public String get(String surname, List<Contacts> list) {
        StringBuilder result = new StringBuilder(surname + " - (Тел: ");
        for (Contacts contact : list) {
            if (contact.getSurname().equals(surname)) {
                result.append(contact.getNumber()).append(", ");
            }
        }
        result.delete(result.length()-2, result.length());
        result.append(")");
        return result.toString();
    }

    public void add(String surname, long number, List<Contacts> list) {
        list.add(new Contacts(surname, number));
    }
}

