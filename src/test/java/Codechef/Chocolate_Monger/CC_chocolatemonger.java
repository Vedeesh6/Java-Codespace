import java.util.*;

public class CC_chocolatemonger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
			int n = sc.nextInt();
			int x=sc.nextInt();
			ArrayList <Integer> arr = new ArrayList<Integer>();
			for(int i=1;i<=n;i++){
				arr.add(sc.nextInt());
			}
			LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>(arr);
			arr.clear();arr.addAll(hashSet);
			System.out.println(arr);
			if(arr.size()<n-x){
				System.out.println(arr.size());
			}else{
				System.out.println(n-x);
			}
	    }sc.close();
    }
}
