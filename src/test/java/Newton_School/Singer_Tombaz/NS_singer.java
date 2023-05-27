import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_singer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),change=0;boolean flag=false;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int arg=sc.nextInt();
            if(!flag && arr.contains(arg)){
                flag=true;continue;
            }
            if((flag && arr.contains(arg) && arg!=0) || (!arr.contains(arg) && arg!=0)){
                arr.add(arg);
            }
            if(arg==0) change=-1;
        }sc.close();
        //System.out.println(arr);
        if(flag) change=0;
        System.out.println(arr.size()+change+1);
    }
}
