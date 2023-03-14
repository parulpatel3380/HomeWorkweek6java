package week6javaPrograms;
//**15. Write a Java program to swap two variables. *//

public class Program15 {
    public static void main(String [] args){
        int a= 50;
        int b= 60;
        int temp;
        System.out.println("Value of a before Swap:"+a);
        System.out.println("Value of b before Swap:"+b);
        temp = a;
        a = b;
        b =temp;

        System.out.println("After the Swap a = b ");
    }
}
