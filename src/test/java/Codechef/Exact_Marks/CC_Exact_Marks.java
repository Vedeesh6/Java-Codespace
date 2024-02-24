import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Exact_Marks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int totalQuestions = sc.nextInt();
		int score = sc.nextInt();
		int stats = (score+2) / 3;
		if(stats * 3 - score + stats > totalQuestions) {
		    System.out.println("NO");
		} else {
		    System.out.println("YES");
		    System.out.println(stats + " " + (stats * 3 - score) + " " + (totalQuestions - stats * 4 + score));
		    }
            
        }
	}
}
