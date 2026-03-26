interface Area{
    public final float PI = 3.14f;
    public void calculate(double a, double b);
}

public class TestAnony{
    public static void main(String[] args){
        Area rec = new Area();
            public void calculate(double a, double b){
            return (a*b);
            }
             
        System.out.println("The area of rectangle: "+rec.calculate(5,8));
    }
}