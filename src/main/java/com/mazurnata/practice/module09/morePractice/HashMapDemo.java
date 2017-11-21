package com.mazurnata.practice.module09.morePractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("J. Dou", new Double(3434.4));
        hm.put("T. Smith", new Double(123.2));
        hm.put("J. Bekker", new Double(1378.0));
        hm.put("T. Holl", new Double(99.2));
        hm.put("R. Smith", new Double(-19.08));

        //get set of entries(записей)
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        //output set entries
        for (Map.Entry<String, Double> me : set ) {
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //put the money
        double balance = hm.get("J. Dou");
        hm.put("J. Dou", balance + 1000);
        System.out.println("new account balance " + hm.get("J. Dou"));
    }
}
