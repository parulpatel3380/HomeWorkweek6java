package week6javaPrograms;
//**17. Write a Java program to convert a decimal number to binary number.
//
//Input Data:
//Input a Decimal Number : 5
//Expected Output
//
//Binary number is: 101 *//


import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Decimal value :");
        int decimalNo = scanner.nextInt();
        String binaryNo = Integer.toBinaryString(decimalNo);
        System.out.println("The binary value for decimal number is :"+ binaryNo);
        scanner.close();
    }
}
