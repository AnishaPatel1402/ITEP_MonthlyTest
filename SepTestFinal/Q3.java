// 3. Exception Handling Problem #2
// 📌 Problem: Age Validator
// Ask the user for their age.
// If the age is less than 18 or greater than 100, throw a custom exception InvalidAgeException.
// Catch the exception and display "Invalid age entered".
// If valid, print "Age accepted: <age>".

import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        super("Invalid age entered");
    }
}
class AgeValidator{
    public void validator(int age) throws InvalidAgeException{
        if(age < 18 || age > 100){
            throw new InvalidAgeException();
        } else{
            System.out.println("Age accepted : "+ age);
        }
    }
}

class Test{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        
        try{
            int age = sc.nextInt();
            AgeValidator a = new AgeValidator();
            a.validator(age);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
     
    }
}