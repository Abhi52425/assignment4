import java.util.Scanner;
class Print
{
    public void print()
    {
        System.out.println("NULL");
    }
    public void print(int p)
    {
        System.out.println("Int  " +p);
    }
    public void print(float p)
    {
        System.out.println("float  " +p);
    }
}
public class overloadprintfn
{
    public static void main(String args[])
    {
        Print x = new Print();
        Print y = new Print();
        Print z = new Print();
        x.print();
        y.print(5);
        z.print(5.5f);
    }
}