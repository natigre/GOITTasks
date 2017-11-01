package com.mazurnata.practice.module08;

import com.mazurnata.practice.module07.animal.simple.BaseAnimal;
import com.mazurnata.practice.module07.animal.simple.Cat;
import com.mazurnata.practice.module07.animal.simple.Snake;

import java.io.*;

public class FileWriterExample {
    private static final String FILE = "animals_data.txt";
    private static final String PATH = "files/lesson08/" + FILE;

    private static final String SEPARATOR = ";";

    static void saveAnimals(BaseAnimal[] animals) {
        try {
            FileWriter writer = new FileWriter(PATH);

            writer.write("" + animals.length + "\n"); //конвертируем в стринг

            for (BaseAnimal animal : animals) {

                writer.write(animal.getClass().getSimpleName() + SEPARATOR);
                writer.write(animal.getName() + SEPARATOR);
                writer.write(animal.getAge() + SEPARATOR);
                writer.write(animal.getWeight() + SEPARATOR);

                if (animal instanceof Snake) {
                    Snake snake = (Snake) animal;
                    writer.write(snake.getLength() + SEPARATOR);
                }
                writer.write("\n");
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static BaseAnimal[] loadAnimals() {
        try {
            FileReader reader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(reader);

            int count = Integer.parseInt(bufferedReader.readLine()); //узнаем количество объектов
            BaseAnimal[] animals = new BaseAnimal[count];

            for (int i = 0; i < animals.length; i++) {
                String line = bufferedReader.readLine();//из нашей линии получаем массив строк, разделив их SEPARATOR'ом
                String[] data = line.split(SEPARATOR);

                String className = data[0];
                String animalName = data[1];
                int animalAge = Integer.parseInt(data[2]);
                float animalWeight = Float.parseFloat(data[3]);

                if (data[0].equals(Cat.class.getSimpleName())) {
                    animals[i] = new Cat(animalName, animalAge, animalWeight);
                }
                if (data[0].equals(Snake.class.getSimpleName())) {
                    float length = Float.parseFloat(data[4]);
                    animals[i] = new Snake(animalName, animalAge, animalWeight, length);
                }
            }
            return animals;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; //в случае ошибки(нет файлаб путь неправильный или в формате ошибка)
    }

    static void printAnimals(BaseAnimal[] animals) {
        for (BaseAnimal animal : animals) {
            System.out.println(animal.getName());
            System.out.println(animal.getAge());
            System.out.println(animal.getWeight());

            if (animal instanceof Snake) {
                Snake snake = (Snake) animal;
                System.out.println(snake.getLength() + SEPARATOR);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        BaseAnimal[] animals = new BaseAnimal[]{
                new Cat("Kitty", 2, 3),
                new Snake("Snake", 12, 35, 10)
        };

        saveAnimals(animals); //сохраняем животных
        animals = null; //удаляем животных из массива
        animals = loadAnimals(); //загружаем из файла
//        BaseAnimal[] animals = loadAnimals();
        printAnimals(animals); //печатаем на экран
    }
}
