
public class stringmethod{
    public static void main(String[] args){
        
        String  name = "Khushi Patel";

        // int length = name.length();
        // char letter = name.charAt(2);
        // int index = name.indexOf("6");
        // int lastIndex = name.lastIndexOf("o");

        // name = name.toUpperCase();
        // name = name.toLOwerCase();
        // name = name.trim();
        // name = name.replace("o", "a");

        // if(name.isEmpty()){
        //         System.out.println("Your name is empty");
        // }
        // else{
        //         System.out.println("Hello "+name);
        // }

        // if(name.contains(" ")){
        //         System.out.println("Your name contains a space");
        // }
        // else{
        //         System.out.println("Your name DOESN'T contain any spaces");
        // }


         if(name.equals("Password")){  //to ignore case sensitivity use .equalsIgnoreCase
                System.out.println("your name can't be password");
        }
        else{
                System.out.println("Hello "+name);
        }

        // System.out.println(name);
        
    }
}