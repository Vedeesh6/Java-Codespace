import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class NS_storypoints{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max_sum=0,index=0;String[] names={"Himanshu","Gorakh","Vikas","Hritvik"};
        for(int i=0;i<4;i++){
            int sum=0;
            for(int j=0;j<5;j++){
                sum+=sc.nextInt();
            }
            if(sum>max_sum){
                max_sum=sum;
                index=i;
            }
        }sc.close();
        System.out.println(names[index]);
    }
}
