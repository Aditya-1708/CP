import java.util.*;
public class WordCaptilization {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Word");
        String word=sc.nextLine();
        if(Character.isUpperCase(word.charAt(0))){
            System.out.println(word);
        }
        else{
            String newWord=Character.toUpperCase(word.charAt(0))+word.substring(1);
            System.out.println(newWord);
        }
    }
}
