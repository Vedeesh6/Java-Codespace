import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_irctcrule {
    public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[3];int sum=0;
		for(int i=0;i<3;i++){arr[i]=sc.nextInt();sum+=arr[i];}
		int d=sc.nextInt(),e=sc.nextInt();sc.close();
		Arrays.sort(arr);
		for(int i=2;i>=0;i--){
			if(arr[i]<=e){sum-=arr[i];break;}
		}
		System.out.println(sum<=d?"yes":"no");
	}
}
