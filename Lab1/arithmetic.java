import java.util.*;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=x+y;
        int b=x-y;
        int c=x*y;
        float d=(float) x/y;
        System.out.println("Addition:"+a);
        System.out.println("Subtraction:"+b);
        System.out.println("Multiplication:"+c);
        System.out.println("Division:"+d);
    }
}
