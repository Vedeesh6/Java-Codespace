import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int maxProfit(int prices[], int size)
    {
        int maxProfit = 0,min=prices[0];
        for (int i = 1; i < size; i++){
            maxProfit = Math.max(maxProfit,prices[i] - min);
            if(prices[i]<min){
                min=prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println(maxProfit(prices,n));
    }
}
