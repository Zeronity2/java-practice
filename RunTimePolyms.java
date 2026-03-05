class A{
    int a;
    void show(){
        System.out.println("A is: "+a);
    }
}
class B extends A{
    int b;
    void show(){
        System.out.println("B is: "+b);
    }
}
class C extends B{
    boolean c;
    void show(){
        System.out.println("C is: "+c);
    }
}

class RunTimePolyms{
    public static void main(String[] args){
        A ref;
        ref = new B();
        ref.show();
    }
}