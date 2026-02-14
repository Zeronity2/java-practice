import java.util.Scanner;
class Pythagorean{
    int a, b, c;
    Pythagorean(){}
    Pythagorean(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    boolean isPythagorean(){
        return (a*a + b*b == c*c)||
        (b*b + c*c == a*a)||
        (c*c + a*a == b*b);
    }
    
}
class TestPythagorean{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pythagorean obj1 = new Pythagorean();
        System.out.print("Enter first number: ");
        obj1.a = sc.nextInt();
        System.out.print("Enter second number: ");
        obj1.b = sc.nextInt();
        System.out.print("Enter third number: ");
        obj1.c = sc.nextInt();

        if(obj1.isPythagorean()){
            System.out.println("It is pythagorean!");
        }
        else{
            System.out.println("Not pythagorean!");
        }
    }
}