/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Truth_and_Dare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
    	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0 ){
		    int n1 = sc.nextInt();
		    List<Integer> a = new ArrayList<>();
		    for (int i = 0 ; i < n1 ; i++ ) a.add(sc.nextInt());
		    int n2 = sc.nextInt();
		    List<Integer> b = new ArrayList<>();
		    for (int i = 0 ; i < n2 ; i++ ) b.add(sc.nextInt());
		    int n3 = sc.nextInt();
		    List<Integer> c = new ArrayList<>();
		    for (int i = 0 ; i < n3 ; i++ ) c.add(sc.nextInt());
		    int n4 = sc.nextInt();
		    List<Integer> d = new ArrayList<>();
		    for (int i = 0 ; i < n4 ; i++ ) d.add(sc.nextInt());
		    boolean flag1 = true;
		    boolean flag2 = true;
		    for( int e : c ){
		        if( !a.contains( e ) ) flag1 = false;
		    }
		    for( int e : d ){
		        if( !b.contains( e ) ) flag2 = false;
		    }
		    if( flag1 && flag2 ){
		        System.out.println( "yes" );
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}
