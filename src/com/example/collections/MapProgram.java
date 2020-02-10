package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "A compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "An interpereted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "An algothmic language");
        languages.put("BASIC", "Beginners all purpose symbolic instruction code");
        languages.put("Lisp", "Therin lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java","this course is about Java");
        }
        System.out.println(languages.get("Java"));
        languages.put("Java", "this course is about Java");
        System.out.println(languages.get("Java"));

        System.out.println();
        System.out.println("==========================================================================");

        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
