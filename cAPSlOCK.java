import java.util.*;
public class cAPSlOCK {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        boolean condi=true;
            if(Character.isLowerCase(str.charAt(0))){
                for(int j=1;j<len;j++){
                    if(Character.isLowerCase(str.charAt(j))){
                        condi=false;
                    }
                }
                str+=Character.toUpperCase(str.charAt(i));
            }
            else if(Character.isUpperCase(str.charAt(i))){
                str+=Character.toLowerCase(str.charAt(i));
            }
        str=str.substring(len);
        System.out.println(str);
    }
}
