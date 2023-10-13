import java.util.*;
import java.lang.Math;
public class tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of trams");
        int n=sc.nextInt();
        int [] a=new int[n];
        int [] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int maxPassengers=0;
        for(int i=0;i<n;i++){
            maxPassengers=Math.max(maxPassengers,maxPassengers-a[i]+b[i]);
            System.out.println(maxPassengers);
        }
        System.out.println(maxPassengers);
    }
}
