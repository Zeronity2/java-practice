import java.util.*;
public class TestIterateMap{
    public static void main(String[] args){
        HashMap <Integer, String> m1 = new HashMap <> ();
        m1.put(100,"Khushi");
        m1.put(60,"Chiya");
        m1.put(50,"chii");

        for(Map.Entry m : m1.entrySet()){
            System.out.println(m.getKey()+ " "+m.getValue());
        }
    }
}