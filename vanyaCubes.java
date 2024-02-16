import java.util.*;
public class vanyaCubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of cubes");
        int n=sc.nextInt();
        int height=0;
        int cubesConsumed=0;
        while(cubesConsumed<n){
            cubesConsumed+=(int)((height+1)*(height+2)/2);
            if(cubesConsumed>n){
                cubesConsumed-=(int)((height+1)*(height+2)/2);
                break;
            }
            height++;
        }
        System.out.println("\n"+height);
    }
}
