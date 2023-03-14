package week6javaPrograms;
//**4. Write a Java programme using the following steps.
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.*//

public class Program4 {
    //1.Two instance variables
    int x,y;
    //Two static variables
    static int a,b;
    //2.Instant method
    public void myMethod (){
        x = 10;
        y = 20;
        a = 30;
        b = 40;
        //Instant and Static variables inside the print statement
        System.out.println(x + y * (a+b));

    }
    //3.Static method
    public static void yourMethod(){
        // Calling instance variable with object and static variable in the static method
        Program4 obj = new Program4();
        obj.x = 100;
        obj.y = 200;
        a = 300;
        b = 400;
        //Instance and static variable inside the print statement
        System.out.println((obj.x + obj.y) * (a+b));

    }
    //main method
    public static void main (String [] args){
        //calling instant method with object and static method in the main method
        Program4 obj1 = new Program4 ();
        obj1.myMethod();
        yourMethod();
    }
}
