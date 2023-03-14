package week6javaPrograms;
//**6. Write a program to enter any radius value of the circle and find out the
//area.(Formula of Area A=PI*r*r).*//

import java.util.Scanner;

public class Program6 {
    public static void main(String [] args){                                      //main method
        double radius;
        double area;                                                               //variable declaration
        Scanner scanner = new Scanner(System.in);                                  //scanner object create
        System.out.println("Enter the radius of the circle :");
        radius = scanner.nextDouble();                                             // store value in radius
        area = Math.PI * radius * radius;                                          //store value in area
        System.out.println("Area of circle is A = PI*radius*radius = " + area);
        scanner.close();

    }
}
