import java.util.*;
public class DivisionException{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter first number: ");
            double x=sc.nextDouble();
            System.out.print("Enter second number: ");
            double y=sc.nextDouble();
            if(y==0){
                throw new ArithmeticException("Cannot divide by zero");
            }
            double res=x/y;
            System.out.println("Result = "+res);
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
