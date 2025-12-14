abstract class Shape{
    int a,b;
    abstract void printArea();
}
class Rectangle extends Shape{
    Rectangle(int x,int y){
        a=x;
        b=y;
    }
    int area;
    void printArea(){
        area=a*b;
        System.out.println("Area of rectangle="+area);
    }
}
class Triangle extends Shape{
    Triangle(int x,int y){
        a=x;
        b=y;
    }
    double area;
    void printArea(){
        area=(a*b)/2.0;
        System.out.println("Area of triangle="+area);
    }
}
class Circle extends Shape{
    Circle(int r){
        a=r;
    }
    double area;
    void printArea(){
        area=3.14*a*a;
        System.out.println("Area of circle="+area);
    }
}
class AreaDemo{
    public static void main(String args[]){
        Rectangle r=new Rectangle(4,5);
        r.printArea();
        Triangle t=new Triangle(5,3);
        t.printArea();
        Circle c=new Circle(5);
        c.printArea();
    }
}
