class Employee{
    String empId;
    String name;
    int salary;
    public Employee(String e,String n,int s){
        empId=e;
        name=n;
        salary=s;
    }
    public void display(){
        System.out.println("Employee Details:");
        System.out.println("Employee ID:"+empId);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
}
class EmployeeDemo{
    public static void main(String args[]){
        Employee e1=new Employee("A01","Divya",200000);
        e1.display();
        Employee e2=new Employee("A02","Disha",150000);
        e2.display();
        Employee e3=new Employee("A03","Deeti",100000);
        e3.display();
    }
}
