import java.util.*;
import java.util.Scanner;

abstract class Shape{
    public abstract void SideOfShapes();
}
class Triangle extends Shape{
    public void SideOfShapes()
    {
        System.out.println("sides of triangel:3");
    }
} 

class Rectangle extends Shape{
    public void SideOfShapes()
    {
        System.out.println("sides of rectangle:4");
    }
} 
class Square extends Shape{
    public void SideOfShapes()
    {
        System.out.println("sides of square:4");
    }
} 
public class sides{

public static void main(String arg[]){
Triangle tri = new Triangle();
Rectangle rect = new Rectangle();
Square sqr = new Square();


System.out.println("Rectangle");
rect.SideOfShapes();
System.out.println("Triangle");
tri.SideOfShapes();
System.out.println("Square");
sqr.SideOfShapes();

}


}