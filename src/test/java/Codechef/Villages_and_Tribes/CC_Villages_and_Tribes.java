/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CC_Villages_and_Tribes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    String S=sc.next();
		    int A=0;
		    int B=0;
		    int dot=0;
		    Stack<Character> st=new Stack<>();
		    
		    for(int i=0;i<S.length();i++){
		        char C=S.charAt(i);
		        if(C=='A'){
		            A++;
		            if(st.isEmpty()) st.push('A');
		            else{
		                if(st.peek()=='A'){ A+=dot;
		                dot=0;
		                st.push(C);
		                }
		                else if(st.peek()!='A'){
		                    dot=0;
		                    st.push(C);
		                }
		            }

		        }else if(C=='B'){
		            B++;
		            if(st.isEmpty()) st.push('B');
		            else{
		                if(st.peek()=='B'){
		                    B+=dot;
		                    dot=0;
		                    st.push('B');
		                }else if(st.peek()!='B'){
		                    dot=0;
		                    st.push('B');
		                }
		            }
		        }else{
		            dot++;
		            if(st.isEmpty()) dot=0;
		        }
		    }
		    System.out.println(A+" "+B);
		    
		}
	}
}
