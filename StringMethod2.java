import java.util.Scanner;
public class StringMethod2{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter char to be replaced: ");
        char ch1 = sc.next().charAt(0);
        System.out.print("Enter char by which we will replace: ");
        char ch2 = sc.next().charAt(0);
        

        String str2 = str1.replace(ch1, ch2);

        System.out.println("Replaced String: "+str2);
    }
}