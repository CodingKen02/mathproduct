/*
Name: Kennedy Keyes
Date: February 18, 2021
Name of Program: MathProduct.java
Description: This program will allow the user to enter three integers
and then determine the product of those three numbers. It will display the
output.
 */
package mathproduct;
import java.util.Scanner; // program uses class Scanner

/**
 *
 * @author codingken
 */
public class MathProduct {
    // main method begins execution of Java application

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first number from user
        
        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read second number from user
        
        System.out.print("Enter third integer: "); // prompt
        int number3 = input.nextInt(); // read third number from user
        
        int product = number1 * number2 * number3; /* multiply numbers, 
        then store total in product */
        
        System.out.printf("Product is %d%n", product); // display product
    } // end method main
    
} // end class MathProduct
