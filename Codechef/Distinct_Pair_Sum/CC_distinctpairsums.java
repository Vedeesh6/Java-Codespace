import java.util.*;

public class CC_distinctpairsums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
			int l= sc.nextInt();
			int r= sc.nextInt();
			/*ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int i=l;i<=r;i++){
				if(!arr.contains(2*i)){
					arr.add(2*i);
				}
				for(int j=i+1;j<=r;j++){
					if(!arr.contains(i+j)){
						arr.add(i+j);
					}
				}
				//System.out.println(arr);
			}System.out.println(arr.size());*/
			System.out.println(2*r-2*l+1);        //possibilities of (1,r) - possibilities of (1,l) + possibility of (l,l)
	    }sc.close();
    }
}
