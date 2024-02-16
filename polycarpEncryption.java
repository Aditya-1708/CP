import java.util.*;
public class polycarpEncryption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int n=sc.nextInt();
        System.out.println("Enter the encrypted message");
        String t=sc.next();
        int dn=1+Math.max((int)((-1+Math.sqrt(1+8*n)/2)),(int)((-1-Math.sqrt(1+8*n)/2)));
        int start=0;
        String decrypted="";
        for(int i=1;i<=dn;i++){
            decrypted+=t.charAt(start);
            start+=i;
        }
        System.out.println(decrypted);
    }
}
