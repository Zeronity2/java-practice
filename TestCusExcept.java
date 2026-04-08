import java.util.*;
class TestCusExcept{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
         }
        int index = sc.nextInt();
        int newValue = sc.nextInt();
        
        try{
            System.out.println(arr[index]);
            arr[index] = newValue;
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Invalid index. Please select a valid from the list");
        }
        sc.close();
    }
}