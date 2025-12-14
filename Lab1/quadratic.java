import java.util.*;
class quad{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==0 && b==0){
            System.out.println("No roots");
        }
        else if(a==0){
            float r1=(float) -c/b;
            System.out.println("One root:"+r1);
        }
        else{
            float det=(b*b)-(4*a*c);
            if(det==0){
                System.out.println("Equal roots");
                float r1=(float) -b/(2*a);
                System.out.println("Roots="+r1+" and "+r1);
            }
            else if(det>0){
                System.out.println("Real & distinct roots");
                float r1=(float) (-b+Math.sqrt(det))/(2*a);
                float r2=(float) (-b-Math.sqrt(det))/(2*a);
                System.out.println("Roots="+r1+" and "+r2);
            }
            else{
                System.out.println("Imaginary roots");
                float real=(float) -b/(2*a);
                double imag=Math.sqrt(Math.abs(det))/(2*a);
                System.out.println("Roots="+real+"+i"+imag+" and "+real+"-i"+imag);
            }
        }
    }
}
