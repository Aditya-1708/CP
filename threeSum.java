import java.util.Scanner;
public class threeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Esum(arr);
    }
    public static void Esum(int [] arr){
        int n=arr.length;
        if(n<3){
            return;
        }
        else if(n==3){
            int sum=arr[0]+arr[1]+arr[3];
            if(sum==0){
                for(int i=0;i<n;i++){
                    System.out.print(arr[i]);
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(j!=i){
                        for(int k=0;k<n;k++){
                        if(k!=i&&k!=j){
                            if(arr[i]+arr[j]+arr[k]==0){
                                System.out.println("["+arr[i]+arr[j]+arr[k]+"]");
                            }
                        } 
                        }
                    }
                }
            }
        }
    }
}
