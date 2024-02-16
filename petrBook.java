import java.util.*;
public class petrBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of pages");
        int n=sc.nextInt();
        System.out.println("Enter the number of pages read in each day of the week");
        int [] pagesRead=new int[7];
        for(int i=0;i<7;i++){
            pagesRead[i]=sc.nextInt();
        }
        while(n>0){
            for(int i=0;i<7;i++){
                n-=pagesRead[i];
                if(n<=0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
