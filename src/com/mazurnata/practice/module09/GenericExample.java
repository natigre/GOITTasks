package com.mazurnata.practice.module09;

import com.mazurnata.practice.module05.animal.Dog;
import com.mazurnata.practice.module09.generics.Data;
import com.mazurnata.practice.module09.generics.GenericData;

public class GenericExample {
    public static void main(String[] args) {

        Data data = new Data();
        data.dataName = "Animal";
        data.dataSize = 100;
        data.data = 0;// не защищено от неверного типа
        data.data = "";// не защищено от неверного типа
        data.data = new Dog("barsick", 102);

        //
        ((Dog)data.data).setAge(10);
        //===============================
        GenericData<Dog> genericData = new GenericData<>();
        genericData.dataName = "Animal";
        genericData.dataSize = 100;
        genericData.data = new Dog("barsick", 102);
//        genericData.data2 = 0; //защищено от неверного типа
        genericData.data.setAge(12);
    }
}
