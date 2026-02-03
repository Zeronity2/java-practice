import java.util.Scanner;

public class VariableScope{

    static int x = 3;//class

    public static void main(String[] args){

        // variable scope = where a variable can be accessed (local or class)       

        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();//local

        dosomething();

    }
    static void dosomething(){

        int x = 4;//Local

        System.out.println(x);
    }

}