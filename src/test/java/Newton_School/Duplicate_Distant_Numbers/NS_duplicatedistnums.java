import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_duplicatedistnums{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int[] arr1 = new int[n];
        for(int i=0; i<n; i++) arr1[i] = sc.nextInt();
        int k = sc.nextInt();sc.close();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<=k && k<n; i++) set.add(arr1[i]);
        boolean flag = set.size() == k+1;int i=k;
        while(i<n-1 && flag){
            set.remove(arr1[i-k]);
            set.add(arr1[++i]);
            flag = set.size() == k+1;
        }
        System.out.println(flag?"No":"Yes");
    }
}
