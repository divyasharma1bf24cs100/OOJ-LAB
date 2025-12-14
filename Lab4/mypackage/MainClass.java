import java.util.*;
import mypackage.Addition;
public class MainClass {
    public static void main(String args[]){
        Addition a=new Addition();
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int x=Sc.nextInt();
        System.out.print("Enter second number:");
        int y=Sc.nextInt();
        a.add(x,y);
    }
}
