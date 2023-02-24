import java.util.Scanner;

public class CC_Sleepychef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            /*int n=sc.nextInt();int k=sc.nextInt();
            String s=sc.next();int nap=0;
            while(s.length()>0){
                if(s.contains("0".repeat(k))){
                    nap++;
                    s=s.substring(s.indexOf("0".repeat(k))+k);
                }else{
                    break;
                }
            }
            System.out.println(nap);*/
            int n=sc.nextInt();int k=sc.nextInt();
            String s=sc.next();int count=0,nap=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    count=0;
                    while(i<n && s.charAt(i)=='0'){
                        count++;i++;
                        if(count==k){nap++;count=0;}
                    }
                }
            }
            System.out.println(nap);
        }sc.close();
    }
}
