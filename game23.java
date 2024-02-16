import java.util.*;
public class game23 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int moves=0;
       while(m>n){
        if(m%3==0){
        
            m/=3;
            moves++;
        }
        else if(m%2==0){
            moves++;
            m/=2;
        }
        else{
            System.out.println("in-1");
            return;
        }
       }
       System.out.println(m+" "+n);
       if(m==n){
        System.out.println(moves);
       }
       else{
        System.out.println("out-1");
       }
    }
}
