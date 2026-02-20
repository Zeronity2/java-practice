import java.util.Scanner;

public class UniqueAppend{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for(int i = 0; i<=str1.length()-1; i++){
            char ch = str1.charAt(i);
            if(result.indexOf(str1.valueOf(ch))<0){
                result.append(ch);
            }
        }

        for(int i = 0 ; i<=str2.length()-1; i++){
            char ch = str2.charAt(i);
            if(result.indexOf(str2.valueOf(ch))<0){
                result.append(ch);
            }
        }
        System.out.println("Appended unique String: "+result);
    }
}