
public class Circle extends Shape {
    
    private double radius;
    
   
    public Circle(String name, String color, double radius) {
      
        super(name, color);
        this.radius = radius;
    }
    
 
    public double getRadius() {
        return radius;
    }
    
   
    public double area() {
      
        return Math.PI * radius * radius;
    }
    
  
    public double perimeter() {
        
        return 2 * Math.PI * radius;
    }
    
   
    public String toString() {
        return super.toString() + ", Shape Type: Circle, Radius: " + radius;
    }
}
