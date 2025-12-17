import java.util.*;
public class StringCharacterPosition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i)+" "+(i + 1));
        }
        int n=s.length()/2;
        System.out.println(s.substring(0,n));
    }
}
