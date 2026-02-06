import java.util.*;
public class Multiply2Darray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        int[][] arr3 = new int[2][2];

        for(int i=0; i<arr1.length ; i++){
            for(int j =0; j<arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

         for(int i=0; i<arr2.length ; i++){
            for(int j =0; j<arr2[i].length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

         for(int i=0; i<arr1.length ; i++){
            for(int j =0; j<arr2[0].length; j++){
                for(int k=0; k<arr1[0].length; k++){
                    arr3[i][j] += arr1[i][k] + arr2[j][k];
                }
            }
        }

        for(int[] i : arr3){
            for(int result : i){
                System.out.print(result +" ");
            }
            System.out.println();
        }
    }
}