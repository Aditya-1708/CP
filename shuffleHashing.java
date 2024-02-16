import java.util.*;
public class shuffleHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String[] p=new String[t];
        String[] h=new String[t];
        for(int i=0;i<t;i++){
            p[i]=sc.next();
            h[i]=sc.next();
        }
testcases : for(int k=0;k<t;k++){
            int i=0;
            while(i<(h[k].length()-p[k].length()+1)){
                if(canMake(h[k].substring(i,p[k].length()+i),p[k])){
                    System.out.println("YES");
                    continue testcases;
                }
                i++;
            }
            System.out.println("NO");
        }
    }
    public static boolean canMake(String a,String b){
        char [] strA=a.toCharArray();
        char [] strB=b.toCharArray();
        Arrays.sort(strA);
        Arrays.sort(strB);
        if(strA.length!=strB.length){
            return false;
        }
        else{
            for(int i=0;i<strA.length;i++){
                if(strA[i]!=strB[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
