public class IB_extractnum {
    public long solve(String A) {
        String num="";
        Vector<Integer> arr = new Vector<Integer>();
        for(int i=0;i<A.length();i++){
            if(Character.isDigit(A.charAt(i))){num=num+A.charAt(i);}
            //System.out.println(num);
            if(num!=""){
                if(i==A.length()-1 || Character.isLetter(A.charAt(i))){arr.add(Integer.parseInt(num));num="";}    
            }
        }long sum=0;
        for(int j=0;j<arr.size();j++){
            sum=sum+arr.elementAt(j);
        }
        return sum;
    }
}
