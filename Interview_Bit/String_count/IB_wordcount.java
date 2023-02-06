public class IB_wordcount {
    public static void main(String[] args) {
        String A="pxgacrtzu   fgtmxgrmnvzdkulqtheucvyyjv cbvnzfcckxvvlprt       ";
        int i = 0;
        int count = 0;
        while(i < A.length()) {
            while(i < A.length() && A.charAt(i) == ' ') i++;
            if (i != A.length()) count++;
            while(i < A.length() && A.charAt(i) != ' ') i++;
        }
        System.out.println(count);
    }
}
