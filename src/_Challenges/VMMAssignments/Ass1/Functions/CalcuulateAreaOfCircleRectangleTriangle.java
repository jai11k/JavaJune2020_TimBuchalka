package _Challenges.VMMAssignments.Ass1.Functions;

//WAP to define a function area which is capable of calculating area of a circle, rectangle
//        and triangle

public class CalcuulateAreaOfCircleRectangleTriangle
{
    public static void main(String[] args)
    {
             Circle circle=new Circle(5.3);
             Rectangle rectangle=new Rectangle(5.6,5.1);
             Triangle triangle=new Triangle(4.1,2.3);

        System.out.println("Area of circle = "+circle.areaCircle());
        System.out.println("Area of Rectangle : " +rectangle.areaRectangle());
        System.out.println("Area of Triangle : " +triangle.areaTriangle());
    }
}


 class Circle
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double areaCircle()
    {
        return (22.0/7.0)*radius*radius ;

    }
}



class Rectangle
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double areaRectangle()
    {
        return length*width;

    }
}


class Triangle
{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double areaTriangle()
    {
        return (base*height)/2;

    }
}




