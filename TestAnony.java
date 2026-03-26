@FunctionalInterface
interface Area{
    public Static final float PI = 3.14f;
    public double calculate(double a, double b);
}

public class TestAnony{
    public static void main(String[] args){
        Area rec = new Area(){
            public double calculate(double a, double b){
            return (a*b);
            }
        };
        Area circle = new Area(){
            public double calculate(double a, double b){
                return (PI*a*a);
            }
        };
        
        // Area r = (a,b)->(a*b);
        // Area c = (a,b)->(Area.PI*a*a);   //lembda syntax

             
        System.out.println("The area of rectangle: "+rec.calculate(5,8));
        System.out.println("The area of circle: "+circle.calculate(1,1));
    }
}