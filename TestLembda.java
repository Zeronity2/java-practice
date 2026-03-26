@FunctionalInterface
interface Area{
    public static final float PI = 3.14f;
    public double compute(double a, double b);
}
class TestLembda{
    public static void main(String[] args){
        Area rec = (a,b)->(a*b);//lembda to calculate the area of rectangle
        Area circle = (a,b)->(Area.PI*a*a);//area of circle

        System.out.println("The area of rectangle: "+rec.compute(3,4));
        System.out.println("The ares of circle: "+circle.compute(1,0));
    }
}