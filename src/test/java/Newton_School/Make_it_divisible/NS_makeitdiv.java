import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_makeitdiv{
    static int minDigits(long n)
  {
    Vector<Character> str = new Vector<Character>();
 
    // Convert number into String
    int i = 0;
    while (n != 0) {
      long rem = n % 10;
 
      // convert int into char
      // by adding '0'
      char ch = (char) (rem + '0');
      str.add(ch);
      n /= 10;
    }
 
    // Reverse String
    Collections.reverse(str);
 
    int ans = Integer.MAX_VALUE;
    int N = str.size();
    for (i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
 
        // Number formed by
        // last two digits
        int num = (str.get(i) - '0')
          * 10
          + (str.get(j) - '0');
 
        if (num % 25 == 0) {
 
          // Count of unwanted digits
          // between i and j
          int a = j - i - 1;
 
          // Count of unwanted
          // digits after j
          int b = N - (j + 1);
          ans = Math.min(ans, a + b);
        }
      }
    }
 
    return ans;
  }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(minDigits(sc.nextLong()));
    }
}
