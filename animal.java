import java.util.Scanner;
abstract class Animal1
{
    private String breed,colour;
    Animal1(String breed,String colour)
    {
        this.breed = breed;
        this.colour = colour;
    }
    public String getBreeddata()
    {
        return breed;
    }
    public String getColourdata()
    {
        return colour;
    }
    public abstract void speak();
}
class Dog extends Animal1
{
    Dog(String b, String c)
    {
        super(b,c);
    }

    public void speak()
    {
        System.out.println("Dog bhonkta hai!!"+"\nbreed = "+getBreeddata()+"\ncolour = "+getColourdata());
    }
}
class Cat extends Animal1
{
    Cat(String b, String c)
    {
            super(b,c);
    }
    public void speak()
    {
        System.out.println("Cat meow krti hai!!"+"\nbreed = "+getBreeddata()+"\ncolour = "+getColourdata());
    }
}
public class animal
{
    public static void main(String args[])
    {
        Cat x = new Cat("breed1","green");
        Dog y = new Dog("breed32","red");
        y.speak();
        x.speak();
    }
}