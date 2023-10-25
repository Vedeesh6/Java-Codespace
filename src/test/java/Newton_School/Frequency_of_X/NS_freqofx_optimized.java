import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_freqofx_optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();sc.close();
        int[] result=searchRange(arr, q);
        System.out.println(result[1]-result[0]+1);
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -2;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == target) {
                start = i;
                break;
            }
            i++;
        }
        if (start == -1) {
            return new int[] { -1, -2 };
        }
        i = nums.length - 1;
        while (i >= 0) {
            if (nums[i] == target) {
                end = i;
                break;
            }
            i--;
        }
        return new int[] { start, end };
    }
}
