import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Budget_Allotment
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            long count = 0;
            long surplus = 0;List<Integer> deficits = new ArrayList<>();
            for(int i = 0; i < n; i++)
              {
                a[i] = sc.nextInt();
                if(a[i] >= x)
                {
                    count++;
                    surplus += a[i] - x;
                }
                else
                {
                    deficits.add(x-a[i]);
                }
            }

        Collections.sort(deficits);
 
            for(int def:deficits)
            {
                if(surplus>=def)
                {
                     surplus-=def;
                     count++;
                }
               
                else
                break;
            }
            System.out.println(count);
        }
    }
}
