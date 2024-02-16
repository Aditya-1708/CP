import java.util.*;
public class kString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int k=sc.nextInt();
        System.out.println("Enter the string");
        String s=sc.nextLine();
        char []array=new char[k];
        int []count=new int[k];
        for(int i=0,n=0;i<k;i++){
            if(isInArray(array,s.charAt(i))==-1){
                count[n]++
            }
        }
    }
    public static int isInArray(char array[],char a){
        for(int i=0;i<=array.length;i++){
            if(array[i]==a){
                return i;
            }
        }
        return -1;
    }
}
