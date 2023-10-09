import java.io.*;
import java.util.*;

class LC_Two_Sum{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int x=Integer.parseInt(read.readLine());
            LC_Two_Sum_Solution ob = new LC_Two_Sum_Solution();
            int ans[]=ob.twoSum(Arr,x);
            for(int i=0;i<2;i++){
                    System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}

class LC_Two_Sum_Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}