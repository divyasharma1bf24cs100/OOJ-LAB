import java.util.*;
import CIE.*;
import SEE.*;
public class FinalMarks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students:");
        int n=sc.nextInt();
        Personal p[]=new Personal[n];
        Internals in[]=new Internals[n];
        External ex[]=new External[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter details of student "+(i+1));
            System.out.print("USN: ");
            String usn=sc.next();
            System.out.print("Name: ");
            String name=sc.next();
            System.out.print("Sem: ");
            int sem=sc.nextInt();
            int im[]=new int[5];
            int sm[]=new int[5];
            System.out.println("Enter 5 internal marks:");
            for(int j=0;j<5;j++) im[j]=sc.nextInt();
            System.out.println("Enter 5 SEE marks:");
            for (int j=0;j<5;j++) sm[j]=sc.nextInt();
            p[i]=new Personal(usn,name,sem);
            in[i]=new Internals(im);
            ex[i]=new External(usn,name,sem,sm);
        }
        System.out.println("Final Marks:");
        for (int i=0;i<n;i++){
            System.out.println("\nStudent:"+p[i].name+"("+p[i].usn+")");
            System.out.print("Final Marks:");
            for (int j=0;j<5;j++) {
                int finalMarks=in[i].marks[j]+(ex[i].seemarks[j]/2); 
                System.out.print(finalMarks);
            }
            System.out.println();
        }
    }
}
