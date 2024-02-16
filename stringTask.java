import java.util.Scanner;
public class stringTask {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string petya");
        String ip=sc.nextLine();
        int len=ip.length();
        for(int i=0;i<len;i++){
            if(isVowel(ip.charAt(i))){
                continue;
            }
            else{
                ip+="."+Character.toLowerCase(ip.charAt(i));
            }
        }
        ip=ip.substring(len);
        System.out.println(ip);
        System.out.println((int)(3.5))
    }
    public static boolean isVowel(char s){
        if(s=='a'||s=='A'||s=='o'||s=='O'||s=='y'||s=='Y'||s=='e'||s=='E'||s=='u'||s=='U'||s=='i'||s=='I'){
            return true;
        }
        return false;
    }
}
