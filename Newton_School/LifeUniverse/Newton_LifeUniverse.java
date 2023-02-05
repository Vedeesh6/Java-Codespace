import java.util.*;
public class Newton_LifeUniverse {
   public static double d(int i,int j,Integer arr[]) {
      int x1,x2,y1,y2;
      x1=arr[(i*2)-2];
      y1=arr[(i*2)-1];
      x2=arr[(j*2)-2];
      y2=arr[(j*2)-1];
      //System.out.println(x1+","+y1+" "+x2+","+y2);
      return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
  }
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      double sum=0;
      int n=sc.nextInt();int k=sc.nextInt();
      Integer[] arr = new Integer[n*2];
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
      }sc.close();
      for(int i=1;i<=n;i++){
          for(int j=i+1;j<=n;j++){
              //System.out.println(d(i, j, arr));
              sum=sum+Math.pow(d(i, j, arr), k);
          }
      }System.out.println(sum);
  }
}
