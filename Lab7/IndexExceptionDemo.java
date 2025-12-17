import java.util.*;
public class IndexExceptionDemo{
    public static void main(String[] args){
        List<String> items=new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Grape");
        Scanner sc=new Scanner(System.in);
        System.out.println("Current list: "+items);
        try{
            System.out.print("Enter index: ");
            int index=sc.nextInt();
            System.out.println("Item: "+items.get(index));
        }catch(IndexOutOfBoundsException e){
            System.out.println("Error: Index out of range");
        }
    }
}
