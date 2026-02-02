import java.util.Scanner;

public class forloop{
    public static void main(String[] args){
        
        // for loop = execute some code a CERTAIN amount of time
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter how many times you want to loop: ");
    int max = sc.nextInt();

    for(int i =0 ; i<=max; i++){
        System.out.println(i);
    }
       sc.close();
    }
}