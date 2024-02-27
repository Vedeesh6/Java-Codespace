import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_aorb {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] arr=new int[2];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                arr[0]++;
            }
            else arr[1]++;
        }
        sc.close();
        System.out.println(Math.abs(arr[0]-arr[1]));
    }
}
