import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_fixarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),max_length=0;
        int[] A=new int[n];
        for(int i=0;i<n;i++){A[i]=sc.nextInt();}
        int k=sc.nextInt();
        sc.close();
        Arrays.sort(A);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(A[0]);
        for(int i=0;i<n-1;i++){
            if(Math.abs(A[i]-A[i+1])>k){
                ans.add(temp);
                temp=new ArrayList<>();
                temp.add(A[i+1]);
                continue;
            }
            temp.add(A[i+1]);
        }
        ans.add(temp);
        //System.out.println(ans);
        for(ArrayList<Integer> i:ans){
            max_length=Math.max(max_length,i.size());
        }
        System.out.println(n-max_length);
    }
}
