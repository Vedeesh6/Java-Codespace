import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class String_and_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int n = arr.length,sum=0;
        String ans="";
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]>='0' && arr[i]<='9'){
                sum+=arr[i]-'0';
            }
            else{
                ans+=arr[i];
            }
        }
        System.out.println(ans+sum);
    }
}
