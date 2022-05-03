package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List sampleList = new ArrayList();
        sampleList.add("blue");
        sampleList.add("purple");
        sampleList.add(1);
        sampleList.add(new Object());

        List<String> colors = new ArrayList<>();
        colors.add("purple");
        colors.add("blue");

        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors);

        for (String color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        List<String> colorsUnmodifiable = List.of(
                "yellow",
                "red"
        );

        for (String color : colorsUnmodifiable) {
            System.out.println(color);
        }
    }
}
