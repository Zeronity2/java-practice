
public class Varargs{
    public static void main(String[] args){

        //varargs = allow a method to accept a varing # of arguments
        //          makes methods more flexible, no neeed for overload methods

    System.out.println(add(1,2,3,4,5,6));

    }
    static int add(int... numbers){

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}