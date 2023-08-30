import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class NS_patinhos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] come = new int[n];
        for(int i=0;i<n;i++){
            come[i]=sc.nextInt();
        }
        int[] go = new int[n];
        for(int i=0;i<n;i++){
            go[i]=sc.nextInt();
        }
        sc.close();
        int count = 0, maxDoctors = 0;
        // Find the maximum departure time
        int maxDepartureTime = go[0];
        for (int i = 1; i < n; i++) {
            maxDepartureTime = Math.max(maxDepartureTime, go[i]);
        }
 
        // Create a vector to store the count of trains at each time
        List<Integer> v = new ArrayList<>(maxDepartureTime + 2);
        for (int i = 0; i < maxDepartureTime + 2; i++) {
            v.add(0);
        }
 
        // Increment the count at the arrival time and decrement at the departure time
        for (int i = 0; i < n; i++) {
            v.set(come[i], v.get(come[i]) + 1);
            v.set(go[i] + 1, v.get(go[i] + 1) - 1);
        }
 
        // Iterate over the vector and keep track of the maximum sum seen so far
        for (int i = 0; i <= maxDepartureTime + 1; i++) {
            count += v.get(i);
            maxDoctors = Math.max(maxDoctors, count);
        }
        System.out.println(maxDoctors);
    }
}

class Pair {
    int come;
    int go;

    Pair(int come, int go) {
        this.come = come;
        this.go = go;
    }
}
