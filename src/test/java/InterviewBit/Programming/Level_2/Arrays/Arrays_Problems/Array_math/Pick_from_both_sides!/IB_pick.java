import java.util.*;
public class IB_pick {
    public int solve(ArrayList<Integer> A, int B) {
        int size = A.size();
        int maxSum = 0;
        for(int i=0; i<B; i++) {
            maxSum += A.get(i);
        }
        if(B == size) {
            return maxSum;
        }
        int localSum = maxSum;
        int startPointer = B - 1;   
        int endPointer = size - 1;  
        
        for(int i=startPointer; i>=0; i--) {
            localSum -= A.get(i);
            localSum += A.get(endPointer);
            maxSum = Math.max(localSum, maxSum);
            endPointer--;
        }
        return maxSum;
    }
}
