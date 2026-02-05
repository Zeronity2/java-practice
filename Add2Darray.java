import java.util.Scanner;

public class Add2Darray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int [2][2];
        int[][] arr2 = new int [2][2];
        int[][] arr3 = new int [2][2];

        System.out.print("Enter first 4 elements:");
        for(int i =0; i<arr1.length; i++){
            for(int j =0; j<arr1[i].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter next 4 elements: ");
        for(int i=0; i<arr2.length; i++){
            for(int j =0; j<arr2[i].length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        
        for(int i=0; i<arr3.length; i++){
            for(int j =0; j<arr3[i].length; j++){ 
                arr3[i][j] = arr1[i][j]+arr2[i][j];
            }
    }
    System.out.print("Addition of both matrix is: ");
    for(int[] i : arr3){
        for(int j : i){
            System.out.print(j+" ");
        }
        System.out.println();

    }
    sc.close();
}
}