package BASICS;
import java.util.Scanner;
public class AreaOfcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // input lene k liye

        System.out.println("Enter the radius: ");
                double r=sc.nextDouble();    // r k input lene k liye
        double a= 3.14141592 *r*r;
        System.out.println("Area is : ");
        System.out.println(a);
    }
    
}
