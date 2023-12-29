import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Chef_and_Icecream
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
		int tc =sc.nextInt();
		while(tc-->0){
		    int n =sc.nextInt();
		    int[] arr =new int[n];
		    int five=0;
		    int ten=0;
		    int fif=0;
		    int flag=0;
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        if(arr[i]==5){five++;}
		        else if(arr[i]==10 && five !=0){ten++;five--;}
		        else if(arr[i]==15 && (five>=2 || ten !=0 )){
		            if(ten !=0){ten--;}
		            else{five=five-2;}
		            fif++;
		        }
		        else{flag=1;}
		    }
		    if(flag==1){System.out.println("NO");}
		    else{System.out.println("YES");}
		}
	}
}
