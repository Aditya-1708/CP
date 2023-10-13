import java.util.*;
public class foxSnake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of m");
        int m=sc.nextInt();
        int l=0,r=1;
        for(int i=0;i<n;i++){
            if((i+1)%2!=0){
                for(int j=0;j<m;j++){
                    System.out.print("#");
                }
                System.out.println();
            }
            else{
                if(l==1){
                    System.out.print("#");
                    l=0;
                    r=1;
                    for(int j=0;j<m-1;j++){
                    System.out.print(".");
                }
                }
                else if(r==1){
                    l=1;
                    r=0;
                    for(int j=0;j<m-1;j++){
                    System.out.print(".");
                }
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}
