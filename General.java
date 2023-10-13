import java.util.Scanner;
public class General {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of soldiers");
        int n = sc.nextInt();
        int [] soldiers=new int[n];
        int max=1,min=100;
        int maxpos=0,minpos=0;
        int seconds=0;
        for(int i=0;i<n;i++){
            soldiers[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(soldiers[i]>max){
                max=soldiers[i];
                maxpos=i;
            }
            if(soldiers[i]<min){
                min=soldiers[i];
                minpos=i;
            }
        }
        if(maxpos>minpos){
            seconds=maxpos+(soldiers.length-minpos-1)-1;
        }
        else{
            seconds=maxpos+(soldiers.length-minpos-1);
        }
        System.out.println(seconds);
    }  
}
