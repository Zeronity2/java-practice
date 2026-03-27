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
class Square implements Area{
    public double compute(double a, double b){
        return (a*a);
    }
}
}
class TestInterface{
    public static void main(String[] args){
        Rec obj = new Rec();
        Circle obj2 = new Circle();
        Square obj3 = new Square();
        System.out.println("Area of Rectangle: "+obj.compute(2,3));
        System.out.println("Area of Circle: "+obj2.compute(2,3));
        System.out.println("Area of square: "+obj3.compute(2,0));
    }
}