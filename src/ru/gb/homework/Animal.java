package ru.gb.homework;

import java.util.Random;

public  class Animal {

    protected String name;
    protected int runDistance;
    protected int swimDistance;
    protected double jumpHeight;
    public Random random = new Random();

    Animal(String name){
        this.name = name;
    }

    public void run( int distance ){
        if ( this.runDistance >= distance) {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        } else {
            System.out.println("Предел " + name + " " + this.runDistance + " м.");
        }
    }

    public void swim( int distance ){
        if ( this.swimDistance >= distance) {
            System.out.println( name + " проплыл(а) " + distance + " м.");
        } else {
            System.out.println("Предел " + name + " " + this.swimDistance + " м.");
        }

    }

    public void jump( int distance ){
        if ( this.jumpHeight >= distance) {
            System.out.println( name + " подпрыгнул(а) на" + distance + " м.");
        } else {
            System.out.println("Предел " + name + " " + this.jumpHeight + " м.");
        }


    }
}
