package ru.gb.homework;

public class Dog extends Animal {

    Dog(String name) {
        super(name);
        this.runDistance = random.nextInt(600);
        this.swimDistance = random.nextInt(20);
        this.jumpHeight = 0.5;
    }

}
