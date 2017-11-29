package com.mazurnata.practice.module10.questions10.flowers;

import com.mazurnata.practice.module08.files.MyFileReader;
import com.mazurnata.practice.module08.files.MyFileWriter;

import java.util.ArrayList;

public class FlowerStore {
    private static final String SEPARATOR = ";";

    public ArrayList<Flower> flowers = new ArrayList<>();

    private String getPricesPath(String filePath) {
        int index = filePath.lastIndexOf("/");
        String firstPart = filePath.substring(0, index + 1);
        String secondPart = filePath.substring(index+ 1, filePath.length());
        return firstPart + "prices_" + secondPart;
    }

    public void save(String filePath) {
        String filePricePath = getPricesPath(filePath);

        MyFileWriter dataWriter = new MyFileWriter(filePath);
        MyFileWriter dataPriceWriter = new MyFileWriter(filePricePath);

        String names = " ";
        for (Flower flower : flowers) {
            names += flower.name + SEPARATOR;
        }
        dataWriter.write(names);

        String prices = " ";
        for (Flower flower : flowers) {
            prices += flower.price + SEPARATOR;
        }
        dataPriceWriter.write(prices);
    }

    public void load(String filePath) {
        String filePricePath = getPricesPath(filePath);

        MyFileReader dataReader = new MyFileReader(filePath);
        MyFileReader dataPricesReader = new MyFileReader(filePricePath);

        String names = dataReader.readLines(1);
        String prices = dataPricesReader.readLines(1);

        String[] arrayNames = names.split(SEPARATOR);
        String[] arrayPrices = prices.split(SEPARATOR);

        flowers.clear();

        for (int i = 0; i < arrayNames.length - 1; i++) {
            flowers.add(new Flower(arrayNames[i], Double.parseDouble(arrayPrices[i])));
        }
    }

    @Override
    public String toString() {
        return "FlowerStore{" +
                "flowers=" + flowers +
                '}';
    }
}
