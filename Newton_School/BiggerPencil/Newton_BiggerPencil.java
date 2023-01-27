package Java;

import java.util.*;

public class Newton_BiggerPencil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();int x=sc.nextInt();int y=sc.nextInt();int z=sc.nextInt();
        Vector<Integer> array = new Vector<Integer>();
        for(int i=0;i<n;i++){
            array.add(sc.nextInt());
        }sc.close();
        if(!checkmagic1(x, array) && !checkmagic2(x, array)){
            if(!checkmagic1(y, array) && !checkmagic2(y, array)){
                if(checkmagic1(z, array) || checkmagic2(z, array)){
                    int temp=z;
                    z=x;x=temp;
                }
            }else if(checkmagic1(y, array) || checkmagic2(y, array)){
                if(checkmagic1(z, array) || checkmagic2(z, array)){
                    int temp=z;
                    z=x;x=temp;
                }else{
                    int temp=y;
                    y=x;x=temp;
                }
            } 
        }else{
            if(!checkmagic1(y, array) && !checkmagic2(y, array)){
                if(checkmagic1(z, array) || checkmagic2(z, array)){
                    int temp=z;
                    z=y;y=temp;
                }
            }
        }
        //System.out.println(x+" "+y+" "+z);
        int time=0;
        if(!array.contains(x)){
            time=time+timefunc(x, array);
            //System.out.println(time);
        }
        if(!array.contains(y)){
            time=time+timefunc(y, array);
            //System.out.println(time);
        }
        if(!array.contains(z)){
            time=time+timefunc(z, array);
            //System.out.println(time);
        }
        System.out.println(time);
    }

    private static boolean checkmagic1(int n, Vector<Integer> array) {
        if(array.contains(n-1)){
            
            return true;
        }return false;
    }

    private static boolean checkmagic2(int n, Vector<Integer> array) {
        if(array.contains(n+1)){
            
            return true;
        }return false;
    }

    private static int timefunc(int n, Vector<Integer> array) {
        int t=0;
        if(checkmagic1(n,array)){
            array.remove(Integer.valueOf(n-1));
            t++;
        }else if(checkmagic2(n, array)){
            array.remove(Integer.valueOf(n+1));
            t++;
        }else{
            Collections.sort(array, Collections.reverseOrder());
            //System.out.println("--"+array);
            Vector<Integer> array1 = new Vector<Integer>();
            for(int i=0;i<array.size();i++){
                if(array.elementAt(i)<n && sum(array1)<=n){
                    array1.add(array.elementAt(i));
                    //
                }
            }
            for(int j=0;j<array1.size();j++){
                if(array.contains(array1.elementAt(j))){
                    array.remove(array1.elementAt(j));
                }
            }
            while (sum(array1)!=n){
                int remaining=sum(array1)-n;
                if(remaining<=array1.lastElement()/2){
                    if(remaining<0){
                        int improve=array1.lastElement()+1;
                        array1.remove(array1.lastElement());
                        array1.add(improve);
                        t++;
                    }else{
                        int improve=array1.lastElement()-1;
                        array1.remove(array1.lastElement());
                        array1.add(improve);
                        t++;
                    }
                }else{
                    //System.out.println(array1.lastElement());
                    array.add(array1.lastElement());
                    //System.out.println(array);
                    array1.remove(array1.lastElement());
                    //System.out.println(array1);
                }
            }t=t+(10*(array1.size()-1));
            if(array1.lastElement()<10){t=array1.lastElement();}
        }
        return t;
    }

    private static int sum(Vector<Integer> array1) {
        int sum=0;
        for(int i=0;i<array1.size();i++){
            sum=sum+array1.elementAt(i);
        }
        return sum;
    }
}
