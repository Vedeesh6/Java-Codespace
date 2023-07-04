import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_ancientnum{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println(checkancient(sc.nextInt()*sc.nextInt()));sc.close();
	}

	private static String checkancient(long i) {
		return (i+"").length()==5?"yes":"no";
	}
}
