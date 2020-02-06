package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compiled high level, object-oriented, platform independent language");
        languages.put("Python", "An interpereted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "An algothmic language");
        languages.put("BASIC", "Beginners all purpose symbolic instruction code");
        languages.put("Lisp", "Therin lies madness");

        System.out.println(languages.get("Java"));
    }
}
