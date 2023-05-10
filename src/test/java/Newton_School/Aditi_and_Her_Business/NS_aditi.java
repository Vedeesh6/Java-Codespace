import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_aditi {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
			    arr[i]=sc.nextInt();
		    }int len=0;sc.close();
		    for(int i=0;i<n-1;i++){
			    while(i<n-1 && arr[i]>arr[i+1]) i++;
			    int j=i;
			    while(j<n-1 && arr[j]<=arr[j+1]) j++;
			    //System.out.println(i+" "+j);
			    len=Math.max(len,j-i+1);
			    i=j;
		    }
		    System.out.println(len);
     }
}
