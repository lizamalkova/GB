package ru.gb.homework;

public class Cat extends Animal
{
    Cat(String name){
        super(name);
        this.runDistance = 200;
        this.jumpHeight = 2;
    }

    @Override
    public void swim(int distance)
    {
        System.out.println("Коты не плавают");
    }
}
