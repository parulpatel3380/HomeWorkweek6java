package week6javaPrograms;
//**1. Write a Java programme using the following steps.
//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement.
//1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and Run the programme.*//
public class Program1 {
    // 1. Instance variables
    int a, b;

    //2. Instance method

    public void addition() {
        //3. instant variable into the instance method
        a = 10;
        b = 50;
        // instance variable inside the print statement
        System.out.println(a + b);

    }

    //4. Main method
    public static void main(String [] args){
        //object creation
        Program1 obj = new Program1();
        //calling instance method in to main method
        obj.addition();

    }


}
