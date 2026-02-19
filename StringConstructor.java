

public class StringConstructor{
    public static void main(String[] args){
        
        String str1 = new String();
        System.out.println("Empty String: "+str1);

        String str2 = "Hello Khushi!";
        String str3 = new String(str2);
        System.out.println("String is : "+str3);

        byte[] a = {110, 111, 112, 113, 114};//ASCII VALUE 
        String str4 = new String(a);
        System.out.println("Byte to string: "+str4);

        char[] b = {'a', 'b', 'c', 'd', 'e'};
        String str5 = new String(b);
        System.out.println("Char to string: "+str5);

    }
}