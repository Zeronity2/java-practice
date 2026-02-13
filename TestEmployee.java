import java.util.Scanner;
 class Employee{
    Scanner sc = new Scanner(System.in);
    int emp_id;
    String name;
    double bal;

    Employee(){}
    Employee(int emp_id, String name, double bal){
        this.emp_id = emp_id;
        this.name = name;
        this.bal = bal;
    }

    void getData(){
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter id: ");
        emp_id = sc.nextInt();
        System.out.print("Balance: ");
        bal = sc.nextDouble();
    }
    void deposite(double x){
        bal = bal + x;
        System.out.println(x+" is added to "+emp_id);
    }
    void withdraw(double x){
        if(x > bal){
            System.out.println("Insufficient Balance");
        }
        else{
            bal = bal - x;
            System.out.println(x+" is deducted from "+emp_id);
        }
    }
    void display(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+emp_id);
        System.out.println("Balance: "+bal);
    }
 }

 class TestEmployee{
    public static void main(String[] args){
        Employee obj1 = new Employee();
        obj1.getData();
        obj1.deposite(2000);
        obj1.withdraw(5000);
        obj1.display();
    }
 }