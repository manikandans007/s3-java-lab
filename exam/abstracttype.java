import java.io.*;
abstract class Shape{
    public abstract void Sideofshapes();

}
class rectangle extends Shape{
    
    public void Sideofshapes() {
    System.out.println("side of rectangle :3");
        
    }
}

class triangle extends Shape{
    
    public void Sideofshapes() {
    System.out.println("side of triangle :3");
        
    }
}

class Square extends Shape{
    
    public void Sideofshapes() {
    System.out.println("side of square :3");
        
    }
}



    public class abstracttype {
   public static void main(String args[]){
   rectangle r = new rectangle();
   r.Sideofshapes();
   triangle t = new triangle();
   t.Sideofshapes();
   Square h = new Square();
   h.Sideofshapes();
   } 
}
