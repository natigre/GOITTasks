package com.mazurnata.practice.module08.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableDeserializableExample {
    public static void main(String[] args) {

        String filename = "peolpe.dat";
        // создадим список объектов, которые будем записывать
        ArrayList<Person> people = new ArrayList();
        people.add(new Person("Jhon", 30, 175));
        people.add(new Person("Tom", 35, 178));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(people);
            System.out.println("Запись произведена");
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        // десериализация в новый список
        ArrayList<Person> newPeople = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            newPeople = (ArrayList<Person>) ois.readObject();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        for (Person p : newPeople)
            System.out.printf("Имя: %s \t Возраст: %d \n", p.name, p.age);
    }
}
