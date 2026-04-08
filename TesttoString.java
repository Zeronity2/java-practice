import java.util.*;
class Area{
    int a, b;
    Area(int a, int b){
        this.a = a;
        this.b = b;
    }
    public String toString(){
        return "Result: " +(a*b);
    }
}

class TesttoString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();

        Area obj = new Area(a,b);
        System.out.println(obj);
    }
}