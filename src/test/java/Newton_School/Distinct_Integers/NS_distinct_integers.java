import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer> new_arr=new LinkedHashSet<>();
        for(int i=0;i<5;i++){
            new_arr.add(sc.nextInt());
        }sc.close();
        System.out.println(new_arr.size());
    }
}
