import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NS_classsorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    ArrayList<Pair1> list=new ArrayList<>();
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        String name=sc.next();
        int marks=sc.nextInt();
        int roll=sc.nextInt();
        list.add(new Pair1(name,marks,roll));
    }
    Collections.sort(list,new Comparator<Pair1>(){
        public int compare(Pair1 p1,Pair1 p2){
            if(p1.marks==p2.marks){
                if(p1.name.equals(p2.name)){
                    return p1.roll-p2.roll;
                }
                return p1.name.compareTo(p2.name);
            }
            return p1.marks-p2.marks;
        }
    });
    for(Pair1 p:list){
        System.out.println(p.name+" "+p.marks+" "+p.roll);
    }
    }
}

class Pair1{
    String name;int marks,roll;
    Pair1(String name,int marks,int roll){
        this.name=name;
        this.marks=marks;
        this.roll=roll;
    }
}
