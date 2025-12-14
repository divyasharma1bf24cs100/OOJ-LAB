import java.util.*;
class Student{
    String usn;
    String name;
    int credits[]=new int[5];
    int marks[]=new int[5]; 
    void accept(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your USN:");
        usn=Sc.nextLine();
        System.out.println("Enter your name:");
        name=Sc.nextLine();
        System.out.println("Enter credits:");
        for(int i=0;i<5;i++){
            credits[i]=Sc.nextInt();
        }
        System.out.println("Enter marks:");
        for(int i=0;i<5;i++){
            marks[i]=Sc.nextInt();
        }
    }
    void display(){
        System.out.println("Student details are:");
        System.out.println("USN:"+usn);
        System.out.println("Name:"+name);
        System.out.println("Credits are:");
        for(int i=0;i<5;i++){
            System.out.println("Credit "+(i+1)+" is "+credits[i]);
        }
        System.out.println("Marks are:");
        for(int i=0;i<5;i++){
            System.out.println("Subject "+(i+1)+" marks is "+marks[i]);
        }
    }
    int gradept(int marks){
        if (marks>=90){
            return 10;}
        else if (marks>=80){
            return 9;}
        else if (marks>=70){
            return 8;}
        else if (marks>=60){
            return 7;}
        else if (marks>=50){
            return 6;}
        else if (marks>=40){
            return 5;}
        else{
            return 0;}
    }
    void calculatesgpa(){
        double sum=0;
        double creditsum=0;
        for(int i=0;i<5;i++){
                sum+=credits[i]*gradept(marks[i]);
                creditsum+=credits[i];
        }
        double sgpa=sum/creditsum;
        System.out.println("SGPA="+sgpa);
    }
}
public class sgpa{
    public static void main(String args[]){
        Student s1=new Student();
        s1.accept();
        s1.display();
        s1.calculatesgpa();
    }
}
