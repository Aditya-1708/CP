import java.util.*;
public class bearBigBrother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weightof limak");
        int a=sc.nextInt();
        System.out.println("Enter the weight of bob");
        int b=sc.nextInt();
        int years=0;
        while(a<=b){
            a*=3;
            b*=2;
            years++;
        }
        System.out.println(years);
    }
}
