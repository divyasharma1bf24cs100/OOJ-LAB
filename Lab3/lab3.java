class Book{
    String name;
    String author;
    int price;
    int num_pages;
    public void read(String name, String author, int price, int num_pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
    public void display(){
        System.out.println("Book details:");
        System.out.println("Name:"+name);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
        System.out.println("Number of pages:"+num_pages);
    }
    public Book(){
        name="xyz";
        author="abc";
        price=0;
        num_pages=0;
    }
    public Book(String n, String a, int p, int num){
        name=n;
        author=a;
        price=p;
        num_pages=num;
    }
    public Book(Book b){
        name=b.name;
        author=b.author;
        price=b.price;
        num_pages=b.num_pages;
    }
}
class lab3{
    public static void main(String args[]){
        Book b1=new Book();
        b1.display();
        Book b2=new Book("10 ways to bury a body","Divya Sharma",500,100);
        b2.display();
        Book b3=new Book("10 ways to kill","Disha Baid",499,99);
        Book b4=new Book();
        b4=b3;
        b4.display();
    }
}
