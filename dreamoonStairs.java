import java.util.*;
public class dreamoonStairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        moves(n,m);
    }    
    public static void moves(int n,int m){
        int moves=0;
        if(m>n){
            System.out.println("-1");
        }
        else{
            if(n%2==0){
                moves=n/2;
            }
            else{
                moves=(n/2)+1;
            }
            while(moves%m!=0){
                moves++;
            }
            System.out.println(moves);
        }
    }
}
