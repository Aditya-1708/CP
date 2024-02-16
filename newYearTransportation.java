import java.util.*;
public class newYearTransportation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int a[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }
        int pos=1;
        if(t>n){
            System.out.println("NO");
            return;
        }
        while(pos<t){
            pos=pos+a[pos-1];
        }
        System.out.println(pos+"  "+t);
        if(pos==t){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
 }   
}
