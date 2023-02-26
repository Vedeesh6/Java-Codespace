import java.util.*; // contains Collections framework

public class NS_contesttime {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();sc.close();String n1="";
        if(n<60){
            n1="0".repeat(2-Integer.toString(n).length())+Integer.toString(n);
            System.out.println("21:"+n1);
        }else{
            n-=60;n1="0".repeat(2-Integer.toString(n).length())+Integer.toString(n);
            System.out.println("22:"+n1);
        }
    }
}
