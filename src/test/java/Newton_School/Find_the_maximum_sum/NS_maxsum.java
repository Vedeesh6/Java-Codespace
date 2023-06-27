import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_maxsum {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),max_odd=0,index=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2!=0 && arr[i]>max_odd){
				max_odd=arr[i];
				index=i;
			}
		}sc.close();
		if(max_odd==0){
			Arrays.sort(arr);
			max_odd=arr[n-1];index=n-1;
		}
		long count_2=0,sum=0;
		for(int i=0;i<n;i++){
			if(index!=i){
				int arg=arr[i];
				while(arg%2==0){
					arg/=2;count_2++;
				}
				sum+=arg;
			}
		}
		sum=(sum+(max_odd*(long)Math.pow(2,count_2)));
		System.out.println(sum);
	}
}
