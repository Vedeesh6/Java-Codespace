import java.util.*;

public class NS_tires {
    /*
    To solve this problem, first check if n is divisible by both 4 and 6, if yes then output n/6 as minimum buses and n/4 as maximum buses. 
    If n is not divisible by both 4 and 6 or by 6 only and (n-(n/6)*6)%4!=0, then output -1. 
    Finally, find the minimum and maximum buses using modular arithmetic taking into account the number of axles and wheels for each bus.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();sc.close();
        if(n%4==0 && n%6==0){
            System.out.println(n/6 + " " + n/4);return;
        }
        if(n%6!=0 && n%4!=0 &&(n-(n/6)*6)%4!=0){
            System.out.println(-1);return;
        }
        Long count6=(n%6==0)?(n/6)*6:(n/6-1)*6,count4=n-count6;
        //System.out.println(count6 + " " + count4);
        Long count4_1=(n%4==0)?(n/4)*4:(n/4-1)*4,count6_1=n-count4_1;
        System.out.println((count6/6+count4/4) + " " + (count4_1/4+count6_1/6));
    }
}
