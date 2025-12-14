import java.util.*;
class Book{
    private String name;
    private String author;
    private double price;
    private int num_pages;
    public Book(String name, String author, double price, int num_pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setNumPages(int num_pages){
        this.num_pages=num_pages;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getNumPages(){
        return num_pages;
    }
    public String toString(){
        return("Book Name: "+name+"\nAuthor: "+author+"\nPrice: Rs. "+price+"\nNumber of Pages: "+num_pages);
    }
}
public class BookDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n=sc.nextInt();
        sc.nextLine();
        Book[] books=new Book[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details for Book "+(i+1)+":");
            System.out.print("Enter Book Name: ");
            String name=sc.nextLine();
            System.out.print("Enter Author Name: ");
            String author=sc.nextLine();
            System.out.print("Enter Price: ");
            double price=sc.nextDouble();
            System.out.print("Enter Number of Pages: ");
            int num_pages=sc.nextInt();
            sc.nextLine();
            books[i] = new Book(name, author, price, num_pages);
        }
        System.out.println("Book Details:\n");
        for(int i=0;i<n;i++) {
            System.out.println("Book "+(i+1)+":\n"+books[i].toString());
        }
    }
}
