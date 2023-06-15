import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_arrangeele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x%2==0){
                even.add(x);
            }else{
                odd.add(x);
            }
        }sc.close();
        for(int i=0;i<n;i++){
            if(i<even.size()){
                System.out.print(even.get(i)+" ");
            }else{
                System.out.print(odd.get(i-even.size())+" ");
            }
        }
    }
}
