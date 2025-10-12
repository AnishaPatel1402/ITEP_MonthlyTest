// 2. Exception Handling Problem #1
// 📌 Problem: Division Calculator
// Write a program that:
// Takes two integers as input.
// Performs division and handles ArithmeticException if the denominator is zero.
// Use a finally block to print "Program Completed".
// Sample Input/Output:
// Input: 10 0  
// Output: Cannot divide by zero  
// Program Completed

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("enter the second number : ");
        int num2 = sc.nextInt();
        int result;
        try{
            result = num1/num2;
            System.out.println("Result is: "+ result);
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Program Completed");
        }

    }
}