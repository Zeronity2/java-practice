@FunctionalInterface
interface Greeting{
    void sayHello();
}
class TestAnonyGreeting{
    public static void main(String[] args){
        Greeting ref = new Greeting(){
          public void sayHello(){
            System.out.println("Hello");
          }
        };
    ref.sayHello();
    }
}