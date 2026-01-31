import java.util.Scanner;

public class substring{
    public static void main(String[] args){

        // .substring() = a method used to extract a portion of a string
        //                   string.substring(start, end)
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your email: ");
        String email = sc.nextLine();


        if(email.contains("@")){
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
             System.out.println("Emsails must contain @");
        }
 

    }
}