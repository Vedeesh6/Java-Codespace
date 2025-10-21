import java.util.*;
class LC_maxnodisteleafterop {
    public int maxDistinctElements(int[] nums, int k) {
        if (nums.length <= (k << 1) + 1) return nums.length;
        Arrays.sort(nums);
        int distinct = 0;
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int m = Math.max(l+1, nums[i]-k);
            if (m <= nums[i]+k) {
                distinct++;
                l = m;
            }
        }
        return distinct;
    }
}
