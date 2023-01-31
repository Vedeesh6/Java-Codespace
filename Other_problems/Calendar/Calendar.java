package Java;
import java.util.Scanner;
public class Calendar {
    static boolean isleap(int year){if (year%4==0 || year%400==0){return true;}else{return false;}}
    public static void main(String[] args) {
        int d=0;
		Scanner scan = new Scanner(System.in);
        System.out.print("Input Month (numerical) -> ");
		int m = scan.nextInt();
        System.out.print("Input Year (full numerical) -> ");
		int y = scan.nextInt();
        scan.close();
		if(isleap(y)){if (m==2){d=29;}}else if(m==2){d=28;}
        if(m==4||m==6||m==9||m==11){d=30;}else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 ||m==12){d=31;}
		System.out.println("In "+y+", the month "+m+" has "+d+" days");
	}
}
