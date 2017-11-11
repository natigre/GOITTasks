package com.mazurnata.practice.module09.generics;

public class GenericData<T> {
    public String dataName;
    public int dataSize;

    public T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
