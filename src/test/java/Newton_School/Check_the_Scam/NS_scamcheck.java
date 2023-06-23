import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_scamcheck {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		    int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();sc.close();
		    System.out.println((z<x)?((x%z==0)?(z*((x/z)+1)):(z*(x/z))):(z*((y/z)+1)));
    }
}
