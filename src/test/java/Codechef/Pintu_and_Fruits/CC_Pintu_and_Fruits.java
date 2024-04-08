import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Pintu_and_Fruits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        try(Scanner scn = new Scanner(System.in)) {
			int cases = scn.nextInt();
			
			while(cases-- > 0) {
				int n = scn.nextInt(); 
				int m = scn.nextInt(); 

				int[] total_prices = new int[m]; 
				int[] contents = new int[n]; 
				Arrays.fill(total_prices, -1); 
				
				for(int i = 0; i < n; ++i) 
					contents[i] = scn.nextInt();
				
				for(int i = 0; i < n; ++i) {
					int type = contents[i] - 1; 
					int price = scn.nextInt();
					if(total_prices[type] == -1) total_prices[type] = price;
					else total_prices[type] += price; 
				}
				
				int min = Integer.MAX_VALUE;
				for(int price : total_prices)
					if(price < min && price != -1) min = price; 
				System.out.println(min);
			}
		}
	}
}

/* 
	Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int M=sc.nextInt();
            
		    int [] bas=new int[N];
		    int [] p=new int[N];
		    
		    for(int i=0;i<N;i++){
		        bas[i]=sc.nextInt();
		    }
		    for(int i=0;i<N;i++){
		        p[i]=sc.nextInt();
		    }
            HashMap<Integer,Integer> hmap=new HashMap<>();
            for(int i=0;i<N;i++){
                
                hmap.put(bas[i],hmap.getOrDefault(bas[i],0)+p[i]);
            }
            int min=Integer.MAX_VALUE;
            for(int i=0;i<N;i++){
               int c= hmap.get(bas[i]);
               if(c<min) min=c;
            }
            
            System.out.println(min);
		    
		}
*/
