package week6javaPrograms;
//**7. Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C).*//

import java.util.Scanner;

public class Program7 {
    public static void main(String [] args){
        double F;                                                       //variable declaration
        double celsius;                                                  //variable declaration
        Scanner scan = new Scanner(System.in);                           //object creation forscanner
        System.out.println("Enter the value in degree Fahrenheit");
        F = scan.nextDouble();
        celsius = ((F - 32 ) * 5) / 9;
        scan.close();
        System.out.println("Convert the value to degree celsius = " + celsius);
    }
}
