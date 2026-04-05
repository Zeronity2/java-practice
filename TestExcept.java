import java.util.*;
class TestExcept{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    try{
    String str = sc.nextLine();
    for(int i =0; i<str.length(); i++){
        char ch = str.charAt(i);

        if(!Character.isDigit(ch)){
            throw new Exception("Error: Only digits allowed");
        }
    }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}
