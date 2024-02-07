import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NS_valoftext {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        String[] arr=sc.nextLine().split(" ");sc.close();
        int count=0;
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            //count capital letters
            int capital=0;
            for(int j=0;j<word.length();j++){
                if(Character.isUpperCase(word.charAt(j))){
                    capital++;
                }
            }
            count=Math.max(capital,count);
        }
        System.out.println(count);
    }
}
