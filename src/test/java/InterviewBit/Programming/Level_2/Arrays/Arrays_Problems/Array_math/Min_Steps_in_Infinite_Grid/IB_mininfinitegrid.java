import java.util.*;

public class IB_mininfinitegrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n=A.size(),ans=0;
    for(int i=0;i<n-1;i++){
        if(Math.abs(A.get(i)-A.get(i+1))<=Math.abs(B.get(i)-B.get(i+1)))
         ans+=Math.abs(B.get(i)-B.get(i+1));
        else{
            ans+=Math.abs(A.get(i)-A.get(i+1));
        }
    }
    return ans;
    }
}
