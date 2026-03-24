class P{
    int x;
    class R{
        void get(){
            System.out.println("hello world");
        }
    }
    public static void main(String args[]){
        P obj = new P();
        P.R objr = obj.new R();
        objr.get();
    }
}