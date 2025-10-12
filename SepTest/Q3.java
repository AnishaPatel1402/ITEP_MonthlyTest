// 3. String Problem #1
// Find First Non-Repeating Character
// Write a program that takes a string input and returns the first character that does not repeat.
// If all characters repeat, return "None".
// Example:
// Input: "swiss" → Output: "w"
// Input: "aabbcc" → Output: "None"
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.next();
        boolean isRepeat = false;

        boolean isVisited[] = new boolean[str.length()];

        for(int i=0; i<str.length(); i++){
            if(isVisited[i]) continue;

            isRepeat = false;
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(j) == str.charAt(i)){
                    isRepeat = true;
                    isVisited[j] = true;
                    break;
                }
            }
            if(isRepeat == false){
                System.out.println("First Non Repeating character is : "+ str.charAt(i));
                break;
            }
        }

        if(isRepeat == true) System.out.println("All Characters are Repeated in the String");
    }
}