import java.util.*;
class NonNumericInputError extends Exception{
    public NonNumericInputError(String msg){
        super(msg);
    }
}
class WithdrawalMoreThanBalanceError extends Exception{
    public WithdrawalMoreThanBalanceError(String msg){
        super(msg);
    }
}
public class BankWithdrawal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double balance;
        double amount;
        try{
            System.out.print("Enter balance: ");
            if(!sc.hasNextDouble())
                throw new NonNumericInputError("Non-numeric input for balance");
            balance = sc.nextDouble();
            System.out.print("Enter withdrawal amount: ");
            if(!sc.hasNextDouble())
                throw new NonNumericInputError("Non-numeric input for withdrawal");
            amount = sc.nextDouble();
            if(amount>balance)
                throw new WithdrawalMoreThanBalanceError("Withdrawal amount exceeds balance");
            balance-=amount;
            System.out.println("New balance = "+balance);
        }catch(NonNumericInputError e){
            System.out.println("Error: "+e.getMessage());
        }catch(WithdrawalMoreThanBalanceError e){
            System.out.println("Error: "+e.getMessage());
    }
}
