package BASICS;

public class Arithematic{
    public static void main(String[] args) {
        float x=10;            // or i can use double data type
        float y=3;
        System.out.println(x+y);
        System.out.println(x-y);     // let us suppose agr x ya y m s koi bhi decimal m hua to ans decimal m hi ayega
        System.out.println(x*y);
        System.out.println((x/y));
        System.out.println(x%y); // this willprint integer division's remainder
    }
}
// Properties of modulo operator
// 1. a%b =a (if a<b)
// 2.a%(-b)= a%b
// 3. (-a)%b= -(a%b)
// 4.(-a)%(-b)=-(a%b)