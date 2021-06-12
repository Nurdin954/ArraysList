package com.company;
import java.util.*;
public class Main {


    public static void main(String[] args) {
        ArrayList<String> book = new ArrayList<>(Arrays.asList("Black_Cover", "Gravity_falls", "Extraordinary", "Naruto", "Boruto"));

        System.out.println(book);

        System.out.println("----------------------------");

        book.remove("Boruto");

        System.out.println(book);

        System.out.println("----------------------------");

        book.add("Transformer");

        System.out.println(book);

        System.out.println(book.get(4));

        System.out.println("----------------------------");

        book.clear();

        System.out.println(book);

        System.out.println("----------------------------");

        book.add("Bakugan");
        book.add("Beyblade");
        book.add("Minecraft");

        System.out.println(book);


    }
}