// Q2. (3 Marks) – Logic Based (String)
// Write a Java program to reverse each word in a string while keeping the word order same.
// Example:
// Input: "Java is very simple"
// Output: "avaJ si yrev elpmis"
import java.util.Scanner;
class Method{
    public String reverse(String str){
        String reverseStr = "";
        for(int i=str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }

    public void reverseEachWord(String str){
        int len = str.length();
        String ans = "";
        String word = "";
        for(int i=0; i<len; i++){
            if(str.charAt(i) != ' '){
                word += str.charAt(i);
            }
            else{
                ans = ans + reverse(word) + " ";
                word = "";
            }
        }
        //for last word
        ans = ans + reverse(word);
        System.out.println("Reversed string is = "+ ans);
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string = ");
        String str = sc.nextLine();
        Method m = new Method();
        m.reverseEachWord(str);
    }
}