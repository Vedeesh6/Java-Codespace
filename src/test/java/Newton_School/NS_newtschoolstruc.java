import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_newtschoolstruc {
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> subtree_size= new ArrayList<Integer>();

    static int calc(int node){
        if(adj.get(node).size()==0){
            return 1;
        }else{
            int sum=0;
            for(int i=0;i<adj.get(node).size();i++){
                sum+=calc(adj.get(node).get(i));
            }
            subtree_size.set(node,sum);
            return sum+1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
            subtree_size.add(0);
        }
        for(int i=2;i<=n;i++){
            int boss=sc.nextInt();
            adj.get(boss).add(i);
        }sc.close();
        calc(1);
        for(int i=1;i<=n;i++){
            System.out.print(subtree_size.get(i)+" ");
        }
    }
}
