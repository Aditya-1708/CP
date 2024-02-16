import java.util.*;
public class luckySumDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        String result="";
        if(sum>0){
            while(sum%7!=0&&sum>0){
                sum-=4;
                result=result+"4";
            }
            while(sum%7==0&&sum>0){
                sum-=7;
                result=result+"7";
            }
        }
        if(sum==0){
            System.out.println(result);
        }
        else{
            System.out.println("-1");
        }
    }
}
