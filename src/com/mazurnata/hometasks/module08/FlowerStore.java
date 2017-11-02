package com.mazurnata.hometasks.module08;

public class FlowerStore {
    private int wallet;

    public FlowerStore() {
        this.wallet = 0;
    }

    public Flower[] sell(int countOfRoses, int countOfCharmomile, int countOfTulip) {

        fillUpWallet(countOfRoses, countOfCharmomile, countOfTulip);

        Flower flower[] = new Flower[countOfCharmomile + countOfRoses + countOfTulip];
        for (int i = 0; i < countOfRoses; i++) {
            flower[i] = new Rose();
        }
        for (int i = countOfRoses; i < countOfRoses + countOfCharmomile; i++) {
            flower[i] = new Chamomile();
        }
        for (int i = countOfCharmomile + countOfRoses; i < countOfCharmomile + countOfRoses + countOfTulip; i++) {
            flower[i] = new Tulip();
        }
        return flower;
    }

    public Flower[] sellSequence(int countOfRoses, int countOfCharmomile, int countOfTulip) {

        fillUpWallet(countOfRoses, countOfCharmomile, countOfTulip);

        Flower[] flower = new Flower[countOfCharmomile + countOfRoses + countOfTulip];
        int i = 0;
        while (i < flower.length){
            if (i < flower.length && countOfRoses > 0){
                countOfRoses--;
                flower[i++] = new Rose();
            }
            if (i < flower.length && countOfCharmomile > 0){
                countOfCharmomile--;
                flower[i++] = new Chamomile();
            }
            if (i < flower.length && countOfTulip > 0){
                countOfTulip--;
                flower[i++] = new Tulip();
            }
        }
        return flower;
    }

    public void fillUpWallet(int countOfRoses, int countOfCharmomile, int countOfTulip) {
        int incomeFromSellOfRose = countOfRoses * new Rose().getPrice();
        int incomeFromSellOfChamomile = countOfCharmomile * new Chamomile().getPrice();
        int incomeFromSellOfTulip = countOfTulip * new Tulip().getPrice();
        wallet = wallet +  incomeFromSellOfRose + incomeFromSellOfChamomile + incomeFromSellOfTulip;
    }

    public int getWallet() {
        return wallet;
    }
}
