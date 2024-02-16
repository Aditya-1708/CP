import java.util.*;
public class choclates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int [] x=new int[n];
        x[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            if(a[i]>=x[i+1]&&x[i+1]>0){
                x[i]=x[i+1]-1;
            }
            else if(a[i]>=x[i+1]&&x[i+1]==0){
                x[i]=x[i+1];
            }
            else if(a[i]<x[i+1]){
                x[i]=a[i];
            }
        }
        int chocsum=0;
        for(int i=0;i<n;i++){
            System.out.println(x[i]);
            chocsum+=x[i];
        }
        System.out.println(chocsum);
    }
}