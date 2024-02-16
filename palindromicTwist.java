import java.util.*;
public class palindromicTwist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[]n=new int[t];
        String[]s=new String[t];
        for(int i=0;i<t;i++){
            n[i]=sc.nextInt();
            s[i]=sc.next();
        }
        for(int i=0;i<t;i++){
            boolean res=true;
            int j=0,k=n[i]-1;
            while(j<k){
                if(s[i].charAt(j)!=s[i].charAt(k)&&((s[i].charAt(j)+1==s[i].charAt(k)-1)||(s[i].charAt(j)-1==s[i].charAt(k)+1))){
                    j++;
                    k--;
                    continue;
                }
                else if(s[i].charAt(j)==s[i].charAt(k)){
                    j++;
                    k--;
                    continue;
                }
                else if(s[i].charAt(j)!=s[i].charAt(k)){
                    res=false;
                    break;
                }
                
            }
            if(res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
