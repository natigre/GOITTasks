package com.mazurnata.practice.module05;

import com.mazurnata.practice.module05.clock.Rolex;
import com.mazurnata.practice.module05.clock.utils.Gear;

public class MainRolex {
    public static void main(String[] args) {
        Rolex rolex = new Rolex("021541",
                new Gear[]{  //создали сложный обьект
                        new Gear("silver", 15),
                        new Gear("silver", 5),
                        new Gear("metal", 5),
                        new Gear("gold", 7),
                        new Gear("silver", 9)
                });

        rolex.show();
    }

}
