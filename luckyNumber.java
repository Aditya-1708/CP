import java.util.*;
public class luckyNumber {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enetr the number ");
     int n=sc.nextInt();
     int luckydigits=0;
     while(n!=0){
        int digit=n%10;
        if(digit==7||digit==4){
            luckydigits++;
        }
        n/=10;
     }   
     if(luckydigits==4||luckydigits==7){
        System.out.println("YES");
     }
     else{
        System.out.println("NO");
     }
    }
}
