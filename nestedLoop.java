import java.util.Scanner;

public class nestedLoop{
    public static void main(String[] args){

        // nested loop = A loop inside another loop
        //          used often with matrices or DS&A

        Scanner sc = new Scanner(System.in);

        int rows;
        int columns;
        char symbol; 

        System.out.print("Enter the # of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = sc.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = sc.next().charAt(0);
     
     for(int j = 0; j < rows; j++){
        for(int i = 0; i<columns; i++){
            System.out.print(symbol+" ");
        }
        System.out.println();
     }

      sc.close();
    }
}