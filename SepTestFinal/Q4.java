// 4. Method Overloading Problem
// 📌 Problem: Area Calculator
// Create a class AreaCalculator with overloaded methods:
// calculateArea(int side) → returns the area of a square.
// calculateArea(int length, int breadth) → returns the area of a rectangle.
// calculateArea(double radius) → returns the area of a circle.
// In main(), demonstrate all three methods.

import java.util.Scanner;
class AreaCalculator{
    public int calculateArea(int side){
        return side * side;
    }
    public int calculateArea(int length, int breadth){
        return length * breadth;
    }

    public double calculateArea(double radius){
        return 3.14 * radius * radius;
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        AreaCalculator a = new AreaCalculator();

        System.out.println("enter the side of square: ");
        int side = sc.nextInt();
        System.out.println("Area of square is: "+ a.calculateArea(side));

        System.out.println();

        System.out.println("enter the length of retangle: ");
        int length = sc.nextInt();
        System.out.println("enter the breadth of retangle: ");
        int breadth = sc.nextInt();
        System.out.println("Area of rectangle is: "+ a.calculateArea(length,breadth));

        System.out.println();

        System.out.println("enter the radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of circle is: "+ a.calculateArea(radius));
        
    }
}