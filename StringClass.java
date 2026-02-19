import java.util.Scanner;
public class StringClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
 
        int first = str.indexOf(ch);
        int last = str.lastIndexOf(ch);

        if(first < 0){
            System.out.println("Char not found");
        }
        else{
            System.out.println("First index of char: "+first);
            System.out.println("Last index of char: "+last);
        }
    }
}