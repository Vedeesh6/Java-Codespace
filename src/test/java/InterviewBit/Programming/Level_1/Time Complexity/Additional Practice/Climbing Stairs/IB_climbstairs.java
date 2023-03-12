public class Solution {
    public int solve(int[] A) {
        int[] costArr = new int[A.length];
        costArr[0] = A[0];
        costArr[1] = A[0] + A[1];

        for(int i = 2; i < A.length; i++){
            costArr[i] = Math.min(costArr[i - 1], costArr[i - 2]) + A[i];
        }
        return costArr[A.length - 1];
    }
}
