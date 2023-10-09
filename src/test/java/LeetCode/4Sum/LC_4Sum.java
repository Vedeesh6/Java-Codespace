import java.io.*;
import java.util.*;

class LC_4Sum{
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
            LC_4Sum_Solution ob = new LC_4Sum_Solution();
            List<List<Integer>> ans=ob.fourSum(Arr,x);
            for(int i=0;i<ans.size();i++){
                for(int j=0;j<ans.get(i).size();j++){
                    System.out.print(ans.get(i).get(j)+" ");
                }
                System.out.println();
            }
        }
    }
}

class LC_4Sum_Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                long res = (nums[i] + nums[j]);
                long remaining = target - res;
            
                int left=j+1;
                int right=nums.length-1;
                while(left<right)
                {
                    long sum=nums[left]+nums[right];
                    if( sum == remaining)
                    {
                        ArrayList<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        if(!ans.contains(temp))ans.add(temp);
                        left++;
                        right--;
                    }
                    else if(sum<remaining)
                    {
                        left++;
                        
                    }
                    else if(sum>remaining){
                       right--;
                    }
                    
                }
            }

        }
        return ans;
        
    }
}