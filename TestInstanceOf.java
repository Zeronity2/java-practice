import java.util.*;
class CustomClass{
    String name;
    int num;

    float SquareRoot(int num){
        return (float) Math.sqrt(num);
    }
}

public class TestInstanceOf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        CustomClass obj = new CustomClass();
        System.out.println("Name is instance of string :"+(name instanceof String));
        System.out.println("Obj is instance of CustomClass: "+(obj instanceof CustomClass));
        System.out.printf("SquareRoot is: %.2f",obj.SquareRoot(num));
        sc.close();
    }
}