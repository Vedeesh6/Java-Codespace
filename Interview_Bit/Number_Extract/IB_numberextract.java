package Java;
import java.util.Vector;

/*Given a string A. The string contains alphanumeric characters.
Find the sum of all numbers present in it */
public class IB_numberextract {
    public static void main(String[] args) {
        String A="f68yna53abryn66stbitjztbxlmhexbnimcbjxmbud69qs";
        String num="";
        Vector<Integer> arr = new Vector<Integer>();
        for(int i=0;i<A.length();i++){
            if(Character.isDigit(A.charAt(i))){num=num+A.charAt(i);}
            if(num!=""){
                if(i==A.length()-1 || Character.isLetter(A.charAt(i))){arr.add(Integer.parseInt(num));num="";}    
            }
        }int sum=0;
        for(int j=0;j<arr.size();j++){
            sum=sum+arr.elementAt(j);
        }System.out.println(sum);
       }
}
