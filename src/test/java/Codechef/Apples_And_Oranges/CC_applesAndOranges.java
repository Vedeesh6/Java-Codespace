/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class CC_applesAndOranges
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0){
		    int a1= sc.nextInt(), b1= sc.nextInt();
            String input1 = Integer.toString(a1);
            String input2 = Integer.toString(b1);
            BigInteger a = new BigInteger(input1);
            BigInteger b = new BigInteger(input2);
            System.out.println(a.gcd(b));
		}
	}
}

/*
	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0){
		    int a1= sc.nextInt(), b1= sc.nextInt();
            while(a!=b){
                if(a>b){
                    a-=b;
                }
                else{
                    b-=a;
                }
            }
            System.out.println(a);
		}
*/


/*
class Codechef
{
    public static int gcd (int a , int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0){
		    int n = s.nextInt();
		    int m = s.nextInt();
		    int val = gcd(n,m);
		    System.out.println(val);
		    t--;
		}
	}
}
*/
