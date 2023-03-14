package week6javaPrograms;
//**14. Write a Java program to print the area and perimeter of a rectangle.
//
//Test Data:
//Width = 5.5 Height = 8.5
//
//Expected Output:
//
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20 *//

public class Program14 {
    public static void main(String []args){
        double width = 5.5;
        double height = 8.5;
        double area,perimeter;
        area=width*height;
        System.out.println(" The area of rectangle  ="+ area);
        perimeter = 2 * (width + height);
        System.out.println("The perimeter of rectangle =" + perimeter );
    }

}
