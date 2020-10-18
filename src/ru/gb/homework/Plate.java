package ru.gb.homework;

public class Plate
{
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public void  decreaseFood( int val )
    {
        this.food -= val;
    }

    public void putFood( int num)
    {
        this.food += num;
    }

    public void info()
    {
        System.out.println("plate: " + food);
    }

    public int getFood(){
        return this.food;
    }

}
