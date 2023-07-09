import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_speeddrive {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int x=sc.nextInt(),p=sc.nextInt(),y=sc.nextInt(),q=sc.nextInt();sc.close();
		System.out.println((x/p)>(y/q)?"Ram":(x/p)<(y/q)?"Shyam":"Equal");
    }
}
