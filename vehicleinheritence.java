import java.util.Scanner;
abstract class Vehicle
{

    public abstract void start();
    public void stop()
    {
        System.out.println("It has Stopped");
    }
}
class twowheeler extends Vehicle
{
        public void start()
        {
                System.out.println("Bike has Started");
        }   
}
class fourwheeler extends Vehicle
{
        public void start()
        {
                System.out.println("Car has Started");
        }
}
public class vehicleinheritence
{
    public static void main(String args[])
    {
        twowheeler x = new twowheeler();
        fourwheeler y = new fourwheeler();
        x.start();
        x.stop();
        y.start();
        y.stop();
    }
}