import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_pythtriplet {
    static boolean checkTriplet(int[] arr, int n) {
        // loop through each element in the array and square it
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }
 
        // sort the array
        Arrays.sort(arr);
 
        // loop through each element in the array starting from the last index
        for (int i = n - 1; i > 1; i--) {
            HashSet<Integer> s = new HashSet<>();
            // loop through each element from the current index to the first index
            for (int j = i - 1; j >= 0; j--) {
                // check if the difference between the current element and the previous element is present in the set
                if (s.contains(arr[i] - arr[j])) {
                    return true;
                }
                // add the previous element to the set
                s.add(arr[j]);
            }
        }
        return false;
    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        System.out.println(checkTriplet(arr, n)?"Yes":"No");
    }
}
