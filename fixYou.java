import java.util.Scanner;
public class fixYou {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("test cases : ");
            int t=sc.nextInt();
            for(int x=1;x<=t;x++){
                System.out.println("enter the number of rows");
            int n=sc.nextInt();
            System.out.println("Enter the number of columns");
            int m=sc.nextInt();
            char [][] a=new char[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=sc.next().charAt(0);
                }
            }
            int changes=0;
            for(int i=0;i<n-1;i++){
                if(a[i][m-1]=='R'){
                    changes++;

                }
            }
            for(int j=0;j<m-1;j++){
                if(a[n-1][j]=='D'){
                    changes++;
                }
            }
            System.out.println(changes);
            }
    }
}
