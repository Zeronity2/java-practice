import java.util.*;

public class prime{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers are: ");

        for(int i = start ; i<= end; i++){
           
             if(i < 2) continue;
            
            int j;
            for(j=2; j<i ; j++){
                if(i % j == 0){
                     break;
                }
            }
            if(j == i){
                System.out.print(i +" ");
            }
        }
    }
}