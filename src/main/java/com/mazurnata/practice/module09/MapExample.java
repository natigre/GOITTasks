package com.mazurnata.practice.module09;

import com.mazurnata.practice.module05.animal.Dog;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> commands = new HashMap<>();
        commands.put("-h", "help command");
        commands.put("-i", "info about the programm command");
        commands.put("-o", "option command");
        commands.put("-q", "quit command");

        String command = "-i";
        System.out.println(commands.get(command));

        HashMap<String, Dog> dog = new HashMap<>();
        dog.put("dolmat", new Dog("Barsik", 13));
        dog.put("koker", new Dog("Barsik2", 4));
        dog.put("koker", new Dog("Barsik100", 10));
        for(String type : dog.keySet()) {
            System.out.println(dog.get(type).getAge());
        }


    }
}
