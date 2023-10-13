import java.util.*;
import java.lang.Math.*;
public class sumround{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        int round[]=new int[t];
        for(int i=0;i<t;i++){
            System.out.println("Enter the numbers");
            round[i]=sc.nextInt();
        }
        
        for(int i=0;i<t;i++){
            List <Integer> roundnums=new ArrayList<Integer>();
            int number=round[i];
            int place=0;
            while(number!=0){
                if(number%10==0){
                    number/=10;
                    place++;
                }
                else{
                    roundnums.add((int)((number%10)*Math.pow(10,place)));
                    number/=10;
                    place++;
                }
            }
            System.out.println(roundnums.size());
            System.out.println(roundnums);
        }
    }
}