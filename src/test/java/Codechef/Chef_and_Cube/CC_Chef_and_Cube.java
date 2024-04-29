import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Chef_and_Cube
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    String[] arr=new String[6];
		    HashMap<String,Integer> hm=new HashMap<>();
		    for(int i=0;i<6;i++){
		        arr[i]=sc.next();
		        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		    }
		   
		   boolean ans=false;
		   for(Entry<String, Integer> entry: hm.entrySet()){
		       if(entry.getValue()>=3){
		           String s=entry.getKey();
		       if( (arr[0].equals(s) || arr[1].equals(s)) && (arr[2].equals(s) || arr[3].equals(s)) && (arr[4].equals(s) || arr[5].equals(s)) ){
	                    ans =true;
		            }
		        }
	        }   
	        if(ans==true)System.out.println("YES");
		    else System.out.println("NO");
        }
    }
}

