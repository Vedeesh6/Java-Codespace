import java.util.*;

public class gks_candydist {
    
    public static void main(String[] args) {
        int testcases,no_bags,no_kids;
        Scanner scan = new Scanner(System.in);
        testcases=scan.nextInt();
        for(int i = 1;i<=testcases;i++){
            int tot_candy=0;
            no_bags=scan.nextInt();
            no_kids=scan.nextInt();
            for (int j = 0; j < no_bags; ++j) {
                tot_candy+=scan.nextInt();
            }
            System.out.println("Case #"+i+": "+tot_candy%no_kids);
        }
        scan.close();
    }
}
