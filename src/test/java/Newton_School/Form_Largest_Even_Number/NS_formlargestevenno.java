import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_formlargestevenno{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),min_even=Integer.MAX_VALUE;sc.close();
        ArrayList<Integer> digits=new ArrayList<>();
        while(n>0){
            int digit=n%10;
            if(digit%2==0) min_even=Math.min(min_even,digit);
            digits.add(digit);
            n/=10;
        }
        if(min_even==Integer.MAX_VALUE) System.out.println(-1);
        else{
            int index=digits.indexOf(min_even);
            int temp=digits.get(digits.size()-1);
            digits.set(digits.size()-1,min_even);
            digits.set(index,temp);
            Collections.sort(digits.subList(0,digits.size()-1),Collections.reverseOrder());
            for(int i:digits) System.out.print(i);
        }
    }
}
