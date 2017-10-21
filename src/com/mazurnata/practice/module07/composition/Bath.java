package com.mazurnata.practice.module07.composition;

//Инициализация в конструкторе с композицией

public class Bath {
    private String s1 = "Happy", s2 = "Happy", //инициализация в точке определения
    s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("в конструкторе Bath()");
        s3 = "Smiled";
        toy = 3.14f;
        castille = new Soap();
    }

    //инициализация экземпляра
    {
        int  i = 47;
    }

    @Override
    public String toString() {
        if (s4 == null) { //отложенная инициализация
            s4 = "Smiled";
        }
        return
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' + ", i=" + i +
                ", castille=" + castille +
                ", toy=" + toy;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}
