package com.mazurnata.hometasks.module07.task01;

import com.mazurnata.hometasks.module07.task01.players.*;

public class PlayerDemo {
    public static void main(String[] args) {
        Player1 player1 = new Player1(20, "Purple Sky");
        Player2 player2 = new Player2(35, "Way Down We Go");

        String[] playlist3 = {"Whistle", "Levels", "Concluded"};
        Player3 player3 = new Player3(42, playlist3);

        String[] playlist4 = {"Don't Worry Be Happy", "Stay", "Wonderful Life"};
        Player4 player4 = new Player4(45, playlist4);

        String[] playlist5 = {"Beautiful Ones", "Shape of You", "Rolling In The Deep"};
        Player5 player5 = new Player5(57, playlist5);

        String[] playlist6 = {"La La La", "Skip a Little Love", "Radioactive", "Back For More"};
        Player6 player6 = new Player6(68, playlist6);

        System.out.println("Player1");
        System.out.println("Price: " + player1.getPrice());
        player1.playSong(player1.getSong());
        System.out.println();
        System.out.println("Player2");
        System.out.println("Price: " + player2.getPrice());
        player2.playSong(player2.getSong());
        System.out.println();
        System.out.println("Player3");
        System.out.println("Price: " + player3.getPrice());
        player3.playSong(playlist3);
        player3.playAllSongs(playlist3);
        System.out.println();
        System.out.println("Player4");
        System.out.println("Price: " + player4.getPrice());
        player4.playSong(playlist4);
        player4.playAllSongs(playlist4);
        System.out.println();
        System.out.println("Player5");
        System.out.println("Price: " + player5.getPrice());
        player5.playSong(playlist5);
        player5.playAllSongs(playlist5);
        System.out.println();
        System.out.println("player6");
        System.out.println("Price: " + player6.getPrice());
        player6.playSong(playlist6);
        player6.playAllSongs(playlist6);
        player6.shuffle(playlist6);
    }
}
