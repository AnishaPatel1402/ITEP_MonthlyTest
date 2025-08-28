// Q1. (3 Marks)
// Write a Java program to check whether a given number is prime or not.
// Input: 29
// Output: 29 is a prime number.
import java.util.Scanner;
class Prime{
    public boolean isPrime(int n){
        boolean prime = true;
        for(int i=2; i<=n/2; i++){
            if(n%i==0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");
        int n = sc.nextInt();

        Prime p = new Prime();
        if(n==1) System.out.println("1 cannot be prime");
        else{
            boolean isPrime = p.isPrime(n);
            if(isPrime) System.out.println(n+" is a Prime number");
            else System.out.println(n+" is not a Prime number");
        }
    }
}