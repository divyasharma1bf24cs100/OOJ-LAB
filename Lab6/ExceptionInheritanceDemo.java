import java.util.Scanner;
class WrongAge extends Exception{
    public WrongAge(String message){
        super(message);
    }
}
class Father{
    int fage;
    public Father(int fage) throws WrongAge{
        if(fage<0){
            throw new WrongAge("Age cannot be negative");
        }
        this.fage=fage;
    }
}
class Son extends Father{
    int sage;
    public Son(int sage, int fage) throws WrongAge{
        super(fage);
        if(sage>=fage){
            throw new WrongAge("Son cannot be older than his father");
        }
        this.sage=sage;
    }
}
public class ExceptionInheritanceDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter father's age: ");
            int x=sc.nextInt();
            Father f=new Father(x);
            System.out.print("Enter son's age: ");
            int y=sc.nextInt();
            Son s = new Son(y,x);
        }catch(WrongAge e){
            System.out.println("Error: "+e);
        }
    }
}
