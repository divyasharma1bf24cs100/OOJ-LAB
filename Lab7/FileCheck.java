import java.io.*;
import java.util.*;
public class FileCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Enter filename (ex: hello.txt): ");
            String fname=sc.nextLine();
            File file=new File(fname);
            if(file.exists()){
                System.out.println("The file exists");
            }else{
                throw new FileNotFoundException("File does not exist");
            }
        }catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
