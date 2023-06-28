import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_rearrange {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr=(sc.next()).toCharArray(),odd=new char[arr.length],even=new char[arr.length];
		int n=arr.length,j=0,k=0;
        for(int i=0;i<n;i++){
            int x=arr[i]-'0';
            if(x%2!=0){
                odd[j++]=arr[i];	
            }else{
                even[k++]=arr[i];
            }
        }sc.close();
        System.out.println(new String(odd,0,j)+new String(even,0,k));
    }
}
