import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_strandgame {
    static final int MAX_CHAR = 26;
 
    // Main Function to calculate min sum of
    // squares of characters after k removals
    static int minStringValue(String str, int k)
    {
        int[] alphabetCount = new int[MAX_CHAR];
        // Here the array stored frequency the number of
        // occurrences in string m[frequency]=number of
        // alphabets with frequency i.e, in our example
        // abbccc m[1]=1(1 a's occur),m[2]=1(2 b's
        // occur),m[3]=1(3 c'soccur)
        int[] m = new int[str.length()];
       
        for (int i = 0; i < str.length(); i++) {
            alphabetCount[str.charAt(i) - 'a']++;
        }
        // Store the maximum
        int maximum = 0;
       
        for (int i = 0; i < MAX_CHAR; i++) {
            m[alphabetCount[i]]++;
            maximum = Math.max(maximum, alphabetCount[i]);
        }
       
        while (k > 0) {
            int z = m[maximum];
            if (z <= k) {
                // Remove one occurrence of alphabet from
                // each with frequency as maximum. So we
                // will have k-z more remove operations to
                // perform as z is number of characters and
                // we perform one removal from each of the
                // alphabet with that frequency.
                k = k - z;
                // As we removed one occurrence from each the
                // alphabets will no longer have the
                // frequency of maximum their frequency will
                // be decreased by one so add these number
                // of alphabets to group with frequency one
                // less than maximum. Remove them from
                // maximum count.
                m[maximum] = 0;
                // Add those to frequency one less.
                m[maximum - 1] += z;
                // new maximum will be one less.
                maximum--;
            }
            else {
                // if all the elements of that frequency
                // cannot be removed we should partially
                // remove them.
                m[maximum] -= k;
                maximum--;
                m[maximum] += k;
                k = 0;
            }
        }
 
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            //(square of frequency)*(number of
            // characters corresponding to that frequency)
            ans += (i * i) * m[i];
        }
 
        return ans;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.next(); // Input 1
        int k = sc.nextInt();
        System.out.println(minStringValue(str, k));
    }
}
