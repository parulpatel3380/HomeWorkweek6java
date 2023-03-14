package week6javaPrograms;
//**8. Write a program to calculate the area of a triangle.*//

import java.util.Scanner;

public class Program8 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter base value");
        float base = scanner.nextFloat();
        System.out.println("Enter height value");
        float height = scanner.nextFloat();
        triangleArea(base,height);
        scanner.close();
    }
    public static void triangleArea(float b,float h ){
        float triangleArea = (b*h)/2;
        System.out.println("Triangle of area: "+triangleArea);
    }
}
