import java.util.*;
public class soldiersBanana {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial cost of banana");
        int k=sc.nextInt();
        System.out.println("Enter the initial number of dollars");
        int n=sc.nextInt();
        System.out.println("Enter the number of bananas");
        int w=sc.nextInt();
        int x=(int)(((w*(w+1)/2)*k)-n);
        System.out.println(x);
    }
}
