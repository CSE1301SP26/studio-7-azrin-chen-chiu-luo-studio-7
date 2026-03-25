public class Rectangle {
//width
//length
//area
//perimeter
    private double width;
    private double length;
    
    private double perimeter;

public Rectangle (double width, double length) {
    this.width= width;
    this.length = length;

    this.perimeter = (2*length)+ (2*width);
}

public void print() {
    System.out.println("Width = " + this.width);
    System.out.println("Length = " + this.length);
    System.out.println("Perimeter = " + this.perimeter);
    
}
public double area () {
    return width * length;
}

    public void isSmaller (Rectangle otherRectangle) {
    if(this.area() < otherRectangle.area()) {
        System.out.println("This rectangle is smaller than the other rectangle.");
    }
    else {
        System.out.println("This rectangle is bigger than the other rectangle.");
    }
}

    public void isSquare (Rectangle otherRectangle) {
        if(this.length == this.width) {
            System.out.println("This rectangle is a square.");
        }else{
            System.out.println("This rectangle is not a square.");
        }
        }
    
public static void main (String [] args) {
    //
    Rectangle r1 = new Rectangle (10, 15);
    r1.print();
    Rectangle r2 = new Rectangle (5,8);
    r1.isSmaller(r2);
    r1.isSquare(r2);
}
}