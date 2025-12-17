import java.util.*;
public class WordCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        String[] words=s.split(" ");
        System.out.println("Word count = "+words.length);
    }
}
