public class Cat
{
    private String name;
    private  int appetite;
    private boolean full = false;

    public  Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate)
    {
        if ( plate.getFood() >= appetite )
        {
            plate.decreaseFood(appetite);
            full = true;
            System.out.println("Коша " + this.name + " сыта!");

        }
        else
        {
            System.out.println("Аппетит у кошки больше, чем еды в миске!");
            System.out.println("Коша " + this.name + " голодная!");
        }
    }



