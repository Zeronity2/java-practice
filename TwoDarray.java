import java.util.*;

public class TwoDarray{
    public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     int[][] arr = new int[2][2];

     System.out.print("Enter the elements: ");

     for(int i =0; i<arr.length; i++){
        for(int j = 0; j<arr[i].length; j++){
            arr[i][j] = sc.nextInt();
        }
     }


    System.out.print("Matrix: ");
    for(int i = 0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            System.out.print(arr[i][j] +" ");
        }
        System.out.println();
     }
    }
}