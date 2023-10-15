import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxstr {
    static String largestString(String num, int k)
{
     
    // Final result String
    StringBuilder ans = new StringBuilder();
    char[] arr = num.toCharArray();
    for(char i : arr)
    {
         
        // If the current char exceeds the
        // character at the top of the stack
        while (ans.length() > 0 && ans.charAt(ans.length() - 1) < i && k > 0) 
        {
             
            // Remove from the end of the String
            ans = ans.deleteCharAt(ans.length() - 1);
 
            // Decrease k for the removal
            k--;
        }
        // Insert current character
        ans.append(i);
    }
     
    // Return the String
    return ans.toString();
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(largestString(sc.next(), sc.nextInt()));
    }
}
