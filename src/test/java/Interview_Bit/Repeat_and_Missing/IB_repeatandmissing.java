
import java.util.*;

public class IB_repeatandmissing {
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
	    
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    Collections.sort(A);
	    long n = A.size();
	    int rep = -1;
	    int miss = -1;
	    long sum = A.get(0);
	    
	    for (int i = 1; i < n; i++) {
	        if (A.get(i).equals(A.get(i - 1))) {
	            rep = A.get(i);
	        }
            sum += A.get(i);
	    }
	    
	    miss = (int) ((n * (n + 1)) / 2 - sum + rep);              //sum till n = n(n+1)/2
	    
	    res.add(rep);
	    res.add(miss);
	    
	    return res;
	    
	}
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);arr.add(3); arr.add(4);
        arr.add(5);arr.add(3); arr.add(6);
        System.out.println(repeatedNumber(arr));
    }
}
