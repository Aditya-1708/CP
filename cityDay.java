import java.util.*;
public class cityDay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean left=true;
        boolean right=true;
        for(int d=0;d<n;d++){
            left=true;
            right=true;
            for(int j=1;j<=x;j++){
                   if(d-j>=0){
                    if(a[d-j]<=a[d]){
                        left=false;
                    }
                   } 
            }
            for(int j=1;j<=y;j++){
                if(d+j<n){
                    if(a[d+j]<=a[d]){
                        right=false;
                    }
                }
            }
            if(left==true&&right==true){
                System.out.println((d+1));
                break;
            }
        }
    }
}
