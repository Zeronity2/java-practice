import java.util.ArrayList;
class TestArrayListWithoutGenerics{
    public static void main(String[] args){
        ArrayList obj = new ArrayList();
        obj.add("Khushi");
        obj.add('A');
        obj.add(1223);
        obj.add(true);

        String name = (String) obj.get(0);
        System.out.println("my name is: "+name);

        System.out.print("List of Array: ");
        for(Object i:obj){
            System.out.println(i);
        }
    }
}