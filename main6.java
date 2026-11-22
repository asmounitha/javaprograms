import java.util.Scanner;
class Circle{
    void CalculateArea(double radius){
        double area= Math.PI*radius*radius;
        System.out.println("Area of Circle:"+area);
    }
}
class Triangle {
    void CalculateArea(double base,double height){
        double area=0.5*base*height;
        System.out.println("Area of Triangle:"+area);
    }
}
public class main6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius=sc.nextDouble();
        Circle circle=new Circle();
        circle.CalculateArea(radius);
        double base,height;
        System.out.println("Enter the base of the triangle:");
        base=sc.nextDouble();
        System.out.println("Enter the height of the triangle:");
        height = sc.nextDouble();
        Triangle t=new Triangle();
        t.CalculateArea(base,height);
        
    }
}