import java.util.Scanner;

public class CheckArray{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     int[] a2 = new int[5];
     for(int i=0; i<a2.length; i++){
        a2[i]=sc.nextInt();
     }
     

     int[] a1 = {1, 2, 3, 5, 8};
     System.out.println("The output is: ");
     for(int x:a2){
        System.out.println(x*2);
     }
     sc.close();
    }
}