interface Area{
    public final float  PI = 3.14f;
    double compute(double a, double b);
}
class Rec implements Area{
   public double compute(double a , double b){
        return (a * b);
    }
}
class Circle implements Area{
   public double compute(double a, double b){
        return (PI * a * a);
    }
class Square
}
class TestInterface{
    public static void main(String[] args){
        Rec obj = new Rec();
        Circle obj2 = new Circle();
        System.out.println("Area of Rectangle: "+obj.compute(2,3));
        System.out.println("Area of Circle: "+obj2.compute(2,3));
    }
}