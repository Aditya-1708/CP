import java.util.*;
public class boyGirl {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : (Username) : ");
        String username=sc.nextLine();
        int numberDistinctChars=1;
        ArrayList<Character> distincts=new ArrayList<Character>();
        distincts.add(username.charAt(0));
        for(int i=1;i<username.length();i++){
            if(isIn(distincts,username.charAt(i))){
                continue;
            }
            else{
                distincts.add(username.charAt(i));
                numberDistinctChars++;
            }
        }
        System.out.println(numberDistinctChars);
        if(numberDistinctChars%2==0){
            System.out.println("Date");
        }
        else{
            System.out.println("Dont Date");
        }
    }
    public static boolean isIn(ArrayList<Character> array,char ele){
        for(int i=0;i<array.size();i++){
            if(array.get(i)==ele){
                return true;
            }
        }
        return false;
    }
}
