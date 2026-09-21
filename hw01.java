package BASICS;

import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be squared:");
        double x= sc.nextDouble();  // to take input of x 
        double square= x*x;
        System.out.println("The square of x is");
        System.out.println(square);
    }
}
