package com.mazurnata.practice.module10.generics;

import java.util.Collection;

public class Data<T extends Collection> {

    public String name;
    public int size;
    public T value;


}
