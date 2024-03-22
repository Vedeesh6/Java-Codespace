import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Cleaning_Up
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt(), turn=1;
            TreeSet<Integer> ts = new TreeSet<>();
            for(int i=0; i<m; i++){
                ts.add(sc.nextInt());
            }
            ArrayList<Integer> al1 = new ArrayList<>();
            ArrayList<Integer> al2 = new ArrayList<>();
            for(int i=1; i<=n; i++){
                if(!ts.contains(i)){
                    if(turn%2==1){
                        al1.add(i);
                        turn += 1;
                    } 
                    else{
                        al2.add(i);
                        turn += 1;
                    }
                }
            }
            if(al1.size()==0) al1.add(-1);
            if(al2.size()==0) al2.add(-1);
            for(int i=0; i<al1.size(); i++){
                System.out.print(al1.get(i)+" ");
            }
            System.out.println();
            for(int i=0; i<al2.size(); i++){
                System.out.print(al2.get(i)+" ");
            }
            System.out.println();
        }
	}
}
