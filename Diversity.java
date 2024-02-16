import java.util.Scanner;
public class Diversity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                System.out.println("YES");
                System.out.print(s.charAt(i));
                System.out.println(s.charAt(i+1));
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
