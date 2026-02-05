import java.util.Scanner;

public class SearchArray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int[] numbers = {1, 9, 2, 8, 5, 4};
        String[] fruits = {"apple", "banana", "orange"};
        boolean isFound = false;
        String target;

        System.out.print("Enter a fruit to serach for: ");
        target = sc.nextLine();

        for(int i = 0; i<fruits.length; i++){
            if (target.equals(fruits[i])){
                System.out.println("Element found at "+i);
                isFound = true;
                break;
            }
            if(!isFound){
                System.out.println("Element not found in the array!");
            }
        }
        sc.close();
    }
}