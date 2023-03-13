public class Solution {
    public int[] solve(String A) {
        int[] arr = new int[A.length()];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(!A.contains(",")){arr[i]=Integer.parseInt(A);count=i+1;break;}
            int num = Integer.parseInt(A.substring(0, A.indexOf(",")));
            arr[i]=num;
            A=A.substring(A.indexOf(",")+1);
        }
        int[] arr1=new int[count];
        System.arraycopy(arr, 0, arr1, 0, count);
        return arr1;
    }
}
