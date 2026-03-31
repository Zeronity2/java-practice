@FunctionalInterface
interface Greeting{
    void sayHello();
}
class TestLembdaGreeting{
    public static void main(String[] args){
        Greeting ref = ()->System.out.println("Hello");
        ref.sayHello();
    }
}