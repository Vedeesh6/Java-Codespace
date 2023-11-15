import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_uniqelesubarr{
    private static int atMostK(int arr[], int n, int k){
        int count = 0, left = 0, right = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (right < n) {
            map.put(arr[right],
                    map.getOrDefault(arr[right], 0) + 1);
            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0)
                    map.remove(arr[left]);
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }

    private static int exactlyK(int arr[], int n, int k){
        return (atMostK(arr, n, k) - atMostK(arr, n, k - 1));
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        int k = set.size();
        System.out.println(exactlyK(arr, n, k));
    }
}
