import java.util.*;
public class cards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tablecard=sc.nextLine();
        String []hand=new String[5];
        for(int i=0;i<5;i++){
            hand[i]=sc.next();
        }
        boolean play=false;
        for(int i=0;i<5;i++){
            if(tablecard.charAt(0)==hand[i].charAt(0)){
                play=true;
            }
            if(tablecard.charAt(1)==hand[i].charAt(1)){
                play=true;
            }
        }
        if(play){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
