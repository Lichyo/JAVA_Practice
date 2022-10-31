package aggregation;

class MyMath
{
    protected int square(int x)
    {
        return x*x;
    }   
}

class Circle
{
    protected MyMath obj;
    public double getArea(int radius)
    {
        obj = new MyMath();
        return (3.14 * obj.square(radius));
    }
}

public class aggregation {
    public static void main(String [] args)
    {
        Circle circle = new Circle();
        System.out.println(circle.getArea(10));
        
    }
}
