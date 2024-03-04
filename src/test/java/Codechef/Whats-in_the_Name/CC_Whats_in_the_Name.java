/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Whats_in_the_Name
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sr=new Scanner(System.in);
		int t=Integer.parseInt(sr.nextLine());
		while(t-->0)
		{
		    String str=sr.nextLine().toUpperCase();
		    char name[][] = new char[3][10];
		    int i,j,c;
		    for(i=0,j=0,c=0;i<str.length();i++){
		        char ch=str.charAt(i);
		        if(ch == 32){
		            j++;
		            c=0;
		            continue;   
		        }
		        name[j][c++]=ch;
		    }
		    String newName="";
		    if(j>=0)    newName = newName + name[0][0];
		    if(j>=1)    newName = newName + ". " + name[1][0];
		    if(j>=2)    newName = newName + ". " + name[2][0];
		    for(i=1; i<10 && name[j][i]!=0; i++)
		        newName = newName + Character.toLowerCase(name[j][i]);

            System.out.println(newName);
		}
	}
}

/*
import java.util.*;
class Nitika{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        input.nextLine();
        while(testCases-->0){
            String names[] = input.nextLine().trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<names.length-1; i++){
                sb.append(names[i].toUpperCase().charAt(0)).append(". ");
            }
            sb.append(names[names.length-1].substring(0,1).toUpperCase());
            sb.append(names[names.length-1].substring(1).toLowerCase());
            System.out.println(sb);
        }
    }
}

*/
