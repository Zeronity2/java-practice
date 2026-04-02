import java.util.*;
class TestException{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        
        int c = 0;
        try{//hitting
            c = a/b;//throwing
        }catch(Exception e){//catch thorwn object
            System.out.println(e);//classname:Name of exception //System.out.println(e.getMessage()); //e.printStacktrace();     
        }
        System.out.println(c);
        System.out.println("Rest of the program...");

    }
}