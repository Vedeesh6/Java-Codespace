import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_construct {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next(),b=sc.next();Boolean flag=true;sc.close();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<a.length();i++){
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
        }
        for(int i=0;i<b.length();i++){
            map.put(b.charAt(i),map.getOrDefault(b.charAt(i),0)-1);
        }
        for(int i=0;i<a.length();i++){
            if(map.get(a.charAt(i))>0){
                flag=false;break;
            }
        }
        System.out.println(flag?"Yes":"No");
    }
}
