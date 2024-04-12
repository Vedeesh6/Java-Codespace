import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_numbersum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        String s=""+arr[0]+arr[1]+arr[2],s1=""+arr[1]+arr[2]+arr[0],s2=""+arr[2]+arr[0]+arr[1];
        System.out.println(Integer.valueOf(s)+Integer.valueOf(s1)+Integer.valueOf(s2));
    }
}
