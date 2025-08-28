// Q1. (3 Marks) – Logic Based (Array)
// Write a Java program to remove duplicate elements from an array and print the unique elements.
// Example:
// Input: [1, 2, 2, 3, 4, 4, 5]
// Output: [1, 2, 3, 4, 5]
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array = ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.print("enter "+ n +" elements = ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       int unique = 0;
        for(int i=0; i<n; i++){
            boolean isUnique = true;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[j] = 0;
                    isUnique = false;
                }
            }
            if(isUnique) unique++;
        }

        System.out.println(unique);

        int newArray[] = new int[unique];

        int idx = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0) {
                newArray[idx] = arr[i];
                idx++;
            }
        }

        System.out.print("unique elements are = ");
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i]+" ");
        }
        
    }
}