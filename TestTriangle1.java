import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTriangle1 {
    public static void main(String[] args) {
        Triangle1 y=new Triangle1();
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter sides of triangle:");
             y.a = s.nextDouble();
             y.b = s.nextDouble();
             y.c = s.nextDouble();
            System.out.printf("Area: %.4f*",y.getArea(y.a,y.b,y.c) );
        } catch (InputMismatchException e) {
            System.out.println("Error, not all numbers!");
        } catch (Exception e) {
            System.out.println("Not a triangle!");
        }
    }
}
class Triangle1 {
    double a;
    double b;
    double c;


    public static double getArea(double a, double b, double c) throws Exception {
        double Area = 0 ,p;
        if (a + b > c && a + c > b && c + b > a) {
            p = (a + b + c) / (2.0);
             Area = Math.sqrt(Math.abs(p * (p - a) * (p - b) * (p - c)));
        }
else{
    throw new Exception();
        }
return Area;
    }
}






