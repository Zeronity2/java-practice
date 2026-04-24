import java.util.ArrayList;
class TestArrayListWithGenerics{
    public static void main(String[] args){
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(12);
        obj.add(23);
        obj.add(34);
        obj.add(45);
        int a = obj.get(1);
        System.out.println(a);

        System.out.print("List of Array: ");
        for(Integer i:obj){
            System.out.println(i);
        }
        
    }
}