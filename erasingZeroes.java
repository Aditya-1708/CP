import java.util.*;
public class erasingZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int start=0;
        int end=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                start=i;
                break;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                end=i;
                break;
            }
        }
        int zeroes=0;
        for(int i=start+1;i<end;i++){
            if(s.charAt(i)=='0'){
                zeroes++;
            }
        }
        System.out.println(zeroes);
    }
}
