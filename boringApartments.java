import java.util.*;
public class boringApartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int []x=new int[t];
        for(int i=0;i<t;i++){
            x[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<t;i++){
            int boringDigit=x[i]%10;
            int count=0;
            while(x[i]>0){
                count++;
                x[i]/=10;
            }
            System.out.println("\n"+((boringDigit-1)*10)+(count*(count+1)/2));
        }

    }
}
