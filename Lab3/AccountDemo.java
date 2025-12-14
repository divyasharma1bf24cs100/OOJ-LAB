class Account{
    private String acc_num;
    private double balance;
    public void setAccountNum(String acc_num){
        this.acc_num=acc_num;
    }
    public String getAccountNum(){
        return acc_num;
    } 
    public void setBalance(double balance){
        if(balance>=0){
            this.balance=balance;
        }else{
            System.out.println("Error");
        }
    }
    public double getBalance(){
        return balance;
    }
    public void display(){
        System.out.println("Account Number:"+acc_num);
        System.out.println("Balance:"+balance);
    }
}
class AccountDemo{
    public static void main(String args[]){
        Account acc=new Account();
        acc.setAccountNum("ACC01234");
        acc.setBalance(6000000);
        acc.display();
    }
}
