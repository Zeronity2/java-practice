import java.util.*;
class TestWordCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isWord = false;
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=' '&& !isWord){
                count++;
                isWord = true;
            }
            else if(str.charAt(i) == ' '){
                isWord = false;
            }
        }
        System.out.println(count);
    }
}