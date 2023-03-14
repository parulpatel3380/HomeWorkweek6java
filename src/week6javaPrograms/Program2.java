package week6javaPrograms;
//**2. Write a Java programme using the following steps.
//2.1 Declare two static variables
//2.2 Declare one static method
//2.3 Call both static variables into the static method inside the print statement.
//2.4 Declare the Main method.
//2.5 Call the static method into the Main method and Run the programme.*//

public class Program2 {

    static int a = 10; //declaring static variable 1
    static int b = 20; // declaring static variable 2
    public static void main(String [] args) {

        program2();                    // calling static method
    }


    public static void program2(){      //declare static method

        System.out.println("The value of a is" +a);    //Print value with concatenation with variable value
        System.out.println("The value of b is" +b);


    }




}
