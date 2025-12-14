import java.util.*;
class Account{
    String customer_name;
    int account_number;
    String account_type;
    double balance;
    public Account(String customer_name,int account_number,String account_type,double balance){
        this.customer_name = customer_name;
        this.account_number = account_number;
        this.account_type = account_type;
        this.balance = balance;
    }
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Updated Balance: Rs. "+balance);
        }else{
            System.out.println("Invalid deposit amount");
        }
    }
    void displayBalance(){
        System.out.println("Current Balance: Rs. "+balance);
    }
}
class Sav_acct extends Account{
    double rate=5.0;
    public Sav_acct(String customer_name, int account_number, double balance){
        super(customer_name, account_number, "Savings", balance);
    }
    void computeAndDepositInterest(){
        double interest=(balance*rate)/100;
        balance+=interest;
        System.out.println("Updated Balance: Rs. "+balance);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Updated Balance: Rs. " + balance);
        }else{
            System.out.println("Insufficient balance.");
        }
    }
}
class Cur_acct extends Account{
    double minBalance=1000.0;
    double penalty=100.0;
    public Cur_acct(String customer_name, int account_number, double balance) {
        super(customer_name, account_number, "Current", balance);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal of Rs. "+amount+" successful.");
        }else{
            System.out.println("Insufficient balance.");
        }
        checkMinimumBalance();
    }
    void checkMinimumBalance(){
        if(balance<minBalance){
            balance-=penalty;
            System.out.println("Balance below minimum. Penalty of Rs. "+penalty+" imposed.");
        }
        System.out.println("Updated Balance: Rs. "+balance);
    }
}
class BankDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name=sc.nextLine();
        System.out.print("Enter account number: ");
        int accno=sc.nextInt();
        System.out.print("Enter account type(1 for Savings/ 2 for Current): ");
        int type=sc.nextInt();
        System.out.print("Enter initial balance: ");
        double bal=sc.nextDouble();
        if(type==1){
            Sav_acct s=new Sav_acct(name, accno, bal);
            System.out.println("Savings Account Created Successfully!\n");
            s.displayBalance();
            System.out.print("Enter amount to deposit: ");
            double dep=sc.nextDouble();
            s.deposit(dep);
            s.computeAndDepositInterest();
            System.out.print("Enter amount to withdraw: ");
            double wd=sc.nextDouble();
            s.withdraw(wd);
            s.displayBalance();
        }else if(type==2){
            Cur_acct c=new Cur_acct(name, accno, bal);
            System.out.println("Current Account Created Successfully!\n");
            c.displayBalance();
            System.out.print("Enter amount to deposit: ");
            double dep=sc.nextDouble();
            c.deposit(dep);
            System.out.print("\nEnter amount to withdraw: ");
            double wd=sc.nextDouble();
            c.withdraw(wd);
            c.displayBalance();
        }else{
            System.out.println("Invalid account type");
        }
    }
}
