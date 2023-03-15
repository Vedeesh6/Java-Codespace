public class IB_wordcount {
    public int solve(String A) {
        int i = 0;
        int count = 0;
        while(i < A.length()) {
            while(i < A.length() && A.charAt(i) == ' ') i++;
            if (i != A.length()) count++;
            while(i < A.length() && A.charAt(i) != ' ') i++;
        }
        return count;
    }
}
