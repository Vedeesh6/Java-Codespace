import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_travtirth {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Pair> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new Pair(i+1, sc.nextInt()));
        }sc.close();
        Collections.sort(arr,new Comparator<Pair>(){
            public int compare(Pair p1,Pair p2){
                return p1.second-p2.second;
            }
        });
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i).first+" ");
        }
    }
}

class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
