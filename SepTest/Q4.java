// 4. String Problem #2
// Reverse Each Word in a Sentence
// Input: "Java makes coding fun"
// Output: "avaJ sekam gnidoc nuf"
// Keep the word order intact but reverse the characters of each word.

import java.util.Scanner;
class Method{
    public String reverseStr(String str){
        StringBuffer sb = new StringBuffer();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        Method m = new Method();
        
        String strArr[] = str.split(" ");

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<strArr.length; i++){
            sb.append(m.reverseStr(strArr[i]));
            if(i != strArr.length-1) sb.append(" ");
            // System.out.println(strArr[i]);
        }
            
        String result = sb.toString();
        System.out.println(result);
        
    }
}