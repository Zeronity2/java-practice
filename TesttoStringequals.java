import java.util.*;
class Studenth{
    String name;
    int id;
    double marks;
    Studenth(String name, int id, double marks){
        this.name = name;
        this.id = id;
        this.marks= marks;
    }

    public String toString(){
        return "Name is: "+name+" id is: "+id+" and marks is: "+marks;
    }

    public boolean equals(Object obj){
    if(obj == null) return false;
    if(!(obj instanceof Studenth)) return false;

    Studenth stu = (Studenth) obj;
    return this.name.equals(this.name);
    

    }
}

class TesttoStringequals{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        int id1 = sc.nextInt();
        double marks1 = sc.nextDouble();
       sc.nextLine();
       String name2 = sc.nextLine();
       int id2= sc.nextInt();
       double marks2 = sc.nextDouble();

       Studenth obj1 = new Studenth(name1,id1,marks1);
       Studenth obj2 = new Studenth(name2,id2,marks2);

       System.out.println(obj1);
       System.out.println(obj2);

       System.out.println(obj1.equals(obj2));

    }
}