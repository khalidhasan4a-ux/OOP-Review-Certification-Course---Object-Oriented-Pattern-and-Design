
public class Rectangle extends Shape {
    
    private double length;
    private double width;
    
  
    public Rectangle(String name, String color, double length, double width) {
        
        super(name, color);
        this.length = length;
        this.width = width;
    }
    
  
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
  
    public double area() {
        
        return length * width;
    }
    
    
    public double perimeter() {
        
        return 2 * (length + width);
    }
    
 
    public String toString() {
        return super.toString() + ", Shape Type: Rectangle, Length: " + length + ", Width: " + width;
    }
}
