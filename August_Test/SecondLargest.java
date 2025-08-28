// Q2. (3 Marks)
// Write a Java program to find the second largest number in an array.
// Example Input: {10, 5, 20, 8, 25, 3}
// Example Output: Second Largest = 20

import java.util.Scanner;
class Max{
    public int firstLarge(int arr[]){
        int max1 = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max1) max1 = arr[i];
        }
        return max1;
    }

    public int secondLarge(int arr[], int firstMax){
        int max2 = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] != firstMax && arr[i] > max2) max2 = arr[i];
        }
        return max2;
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a the size of array = ");
        int n = sc.nextInt();

        int arr[] = new int [n];
        System.out.print("enter "+ n + " elements of array = ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Max m = new Max();
        int firstMax = m.firstLarge(arr);
        System.out.println("first largest = "+ firstMax);

        int secondMax = m.secondLarge(arr, firstMax);
        System.out.println("second largest = "+ secondMax);
        
    }
}