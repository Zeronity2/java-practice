import java.util.Scanner;
class Student{
    int id;
    String name;
    int marks;

    Student(){}
    Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    void grace(){
        if(marks>=80){
            marks += 10;
            System.out.println("Grace marks are added!");
        }
    }

    void showData(){
        System.out.println("Student id: "+id);
        System.out.println("Student name: "+name);
        System.out.println("Marks: "+marks);
    }

}

class Object{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student obj1 = new Student();
        System.out.print("Enter id: ");
        obj1.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        obj1.name = sc.nextLine();
        System.out.print("marks: ");
        obj1.marks = sc.nextInt();

        obj1.grace();
        obj1.showData();
    } 
}