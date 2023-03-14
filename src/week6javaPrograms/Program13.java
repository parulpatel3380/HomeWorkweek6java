package week6javaPrograms;
//**13. Write a Java program that takes three numbers as input to calculate and
//print the average of the numbers. *//

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);           //scanner object for enter the value
        System.out.println("Enter the first value");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second value");
        int number2 = scanner.nextInt();
        System.out.println("Enter the three value");
        int number3 = scanner.nextInt();

        Program13 input = new Program13();           // create object
        input.average(number1, number2,number3 );    //instance method calling using
        scanner.close();
    }
    //static method
    public static void average(int number1,int number2, int number3) {
        double average = (number1 + number2  + number3) / 3;
        System.out.println("Average of number: " +average);
    }




}
