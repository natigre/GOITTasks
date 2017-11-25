package com.mazurnata.practice.module10.enumExample;

import static com.mazurnata.practice.module10.enumExample.Gender.female;
import static com.mazurnata.practice.module10.enumExample.Gender.male;
import static com.mazurnata.practice.module10.enumExample.Gender.unknown;

public class EnumExample {

    public static void main(String[] args) {
        User user1 = new User("User1", female);
        User user2 = new User("User2", male);
        User user3 = new User("User3", unknown);


    }
}
