import java.util.Scanner;
public class lucky {
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println(Solver(n,""));
        int a=n;
        int b=n;

    }
    public static String Solver(int n,String s)
    {

        if(n==4)
        {
            return (s+"4");
        }
        else if(n==7)
        {
            return (s+"7");
        }
        else if(n<4&&n!=0)
        {
            return "-1";
        }
        else if(n==0){
            return s+Integer.MAX_VALUE;
        }
        String s2=Solver(n-4,s+"4");
        String s1=Solver(n-7,s+"7");

        long m=Long.parseLong(s1);
        long n1=Long.parseLong(s2);
        System.out.println(s1+"\t"+s2);
        return ""+Math.min(m,n1);
    }
}

