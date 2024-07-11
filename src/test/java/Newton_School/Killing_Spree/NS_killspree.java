import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_killspree {
    static long squareSeries(long n)
{
    return(n * (n + 1) * (2 * n + 1)) / 6;
}
 
// maxPeople function which returns
// appropriate value using Binary Search
// in O(logn)
static long maxPeople(long n)
{
     
    // Set the lower and higher values
    long low = 0;
    long high = 10000L;
    long ans = 0L;
     
    while (low <= high)
    {
         
        // Calculate the mid using
        // low and high
        long mid = low + ((high - low) / 2);
        long value = squareSeries(mid);
 
        // Compare value with n
        if (value <= n)
        {
            ans = mid;
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }
     
    // Return the ans
    return ans;
}
 
// Driver code
public static void main(String[] args)
{
    System.out.println(maxPeople(new Scanner(System.in).nextLong()));
}
}
