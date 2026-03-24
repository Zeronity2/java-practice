
//static
class A{
    static class B{
        void get(){
            System.out.println("hello world");
        }
    }

    public static void main(String args[]){
        A.B obj = new A.B();
        obj.get();
    }
}