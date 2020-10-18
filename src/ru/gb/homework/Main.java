package ru.gb.homework;

public class Main {

    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Дуся", 8);
        Cat cat2 = new Cat("Тася", 10);
        Cat cat3 = new Cat("Мася", 12);
        Plate plate1 = new Plate(10);
        Plate plate2 = new Plate(25);
        Plate plate3 = new Plate(7);
        Plate plate4 = new Plate(50);

        plate3.info();
        cat1.eat(plate3);
        plate3.info();

        plate2.info();
        cat2.eat(plate2);
        cat3.eat(plate2);
        plate2.info();
        cat1.eat(plate2);
        plate2.info();

        Cat[] cats = { cat1, cat2, cat3 };

        plate4.info();
        catsAreEating(cats,plate4);
        plate4.info();

        plate1.info();
        plate1.putFood(7);
        plate1.info();
    }

    static void catsAreEating(Cat[] cats, Plate plate)
    {
        for ( int i = 0; i < cats.length; i++)
        {
            cats[i].eat(plate);
        }
    }

}
