package iuh.fit.se;
import java.util.Scanner;
public class RectangleTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        iuh.fit.se.Rectangle r1 = new iuh.fit.se.Rectangle(5.0,3.0);

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        r1.setWidth(width);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        r1.setLength(length);
        System.out.println("Area:" + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("The length of the rectangle is " + r1.getLength());
        System.out.println("The width of the rectangle is " + r1.getWidth());
        System.out.println(r1.toString());
        sc.close();
    }

}