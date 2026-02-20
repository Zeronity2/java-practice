import java.util.Scanner;
public class UniqueString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for(int i =0; i<=str.length()-1; i++){
            char ch = str.charAt(i);

            if(result.indexOf(str.valueOf(ch))<0){
                result.append(ch);
            }
        }
        System.out.println("Unique String: "+result);
    }
}