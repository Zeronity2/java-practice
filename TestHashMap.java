import java.util.HashMap;
public class TestHashMap{
    public static void main(String[] args){
        HashMap <String, Integer> map = new HashMap <> ();
        map.put("Khushi",100);
        map.put("chiya", 50);

        System.out.println("Size: "+map.size());
        System.out.println(map);

        if(map.containsKey("Khushi")){
            Integer a = map.get("Khushi");
            System.out.println(a);
        }
    }
}