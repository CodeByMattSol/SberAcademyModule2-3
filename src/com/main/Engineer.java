package com.main;

public class Engineer extends Worker {

    public Engineer(String name, String prof, int money) {
        this.name = name;
        this.prof = prof;
        this.money = money;
    }

    @Override
    public void myOccupation() {
        System.out.println("Имя работника: " + name);
        System.out.println("Профессия: " + prof);
        System.out.println("Заработная плата: " + money);
    }
}
