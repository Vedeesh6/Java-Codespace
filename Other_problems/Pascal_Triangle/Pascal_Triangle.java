package Java;

import java.util.ArrayList;

/*
 * [
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
 * ]
 */
public class Pascal_Triangle {
    public ArrayList<ArrayList<Integer>> pascaltri(int A) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<A;i++){
            ArrayList<Integer> line = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    line.add(1);
                }else{
                    line.add(arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
                }
            }
            arr.add(line);
        }
        return arr;
    }
    public static void main(String[] args) {
        int A =5;
        Pascal_Triangle obj=new Pascal_Triangle();
        System.out.println(obj.pascaltri(A));
    }
}
