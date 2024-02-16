import java.util.*;
public class roosmStaircases {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testCases=sc.nextInt();
        int n[]=new int[testCases];
        String s[]=new String[testCases];
        for(int t=0;t<testCases;t++){
            n[t]=sc.nextInt();
            s[t]=sc.next();
        }
        int i,j,pos=-1;
        for(int t=0;t<testCases;t++){
            pos=-1;
            i=0;
            j=n[t]-1;
            while(i<=j){
                if(s[t].charAt(i)=='1'){
                    pos=i;
                    break;
                }
                else if(s[t].charAt(j)=='1'){
                    pos=j;
                    break;
                }
                j--;
                i++;
            }
            if(pos>-1){
                if(pos>=(n[t]/2)){
                    System.out.println((pos+1)*2);
                }
                else{
                    System.out.println((n[t]-pos)*2);
                }
            }
            else{
                System.out.println(n[t]);
            }
        }
    }   
}