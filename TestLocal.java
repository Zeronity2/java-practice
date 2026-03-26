class A{
    private int value = 800;
    public void showMethod(){
        class B{
            B(){
            System.out.println("The value is: "+value);
            }
            void show(){
                System.out.println("Hello World");
            }
        }
        B b = new B();
        b.show();
    }
}

class TestLocal{
    public static void main(String[] args){
        A obj = new A();
        obj.showMethod();
    }
}