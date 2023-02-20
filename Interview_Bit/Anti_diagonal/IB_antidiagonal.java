import java.util.*;

public class IB_antidiagonal {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            ArrayList<Integer> line = new ArrayList<>();
            for(int j=0,k=i;j<=i;j++,k--){
                line.add(A.get(j).get(k));
            }
            arr.add(line);
        }
        for(int i=1;i<A.size();i++){
            ArrayList<Integer> line = new ArrayList<>();
            for(int j=i,k=A.size()-1;k>=i;j++,k--){
                line.add(A.get(j).get(k));
            }
            arr.add(line);
        }
        return arr;
    }
}
