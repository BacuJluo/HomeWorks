package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Words {
    public void isWords() {
        List<String> list = new ArrayList<>();
        list.add("Яблоко");
        list.add("Дерево");
        list.add("Земля");
        list.add("Корова");
        list.add("Дерево");
        list.add("Мясо");
        list.add("Язык");
        list.add("Стекло");
        list.add("Дерево");
        list.add("Яблоко");
        list.add("Грязь");

        System.out.println(list.stream().distinct().collect(Collectors.toList()));

        Map<String, Integer> count = new HashMap<>();
        for (String element : list) {
            if (count.containsKey(element)) {
                count.put(element, count.get(element)+1);
            } else {
                count.put(element, 1);
            }
        }
        System.out.println(count);

    }
}
