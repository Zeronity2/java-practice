abstract class Animal{
    int a;
    abstract void makeNoise();
}
class Dog extends Animal{
    int b;
    void food(){
        System.out.println("Dogs eat biscuit.");
    }
    void makeNoise(){
        System.out.println("bhawbhawbhawbhawbhaw........");
    }
}

class TestAbstract{
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.makeNoise();
        obj.food();
    }
}