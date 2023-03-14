package week6javaPrograms;
//**9. Write a program to convert the upper case to lower case.*//


import java.util.Scanner;

public class Program9 {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);                 //scanner for object creation
        System.out.println("Enter Upper case");
        String uppercase = input.nextLine();
        System.out.println("String in lowercase is");
        String lowercase = input.nextLine();
        System.out.println("String in uppercase is" + uppercase.toUpperCase());  //inbuilt method calling direct
        System.out.println("String in lowercase is" + lowercase.toLowerCase());
        input.close();
    }
}
