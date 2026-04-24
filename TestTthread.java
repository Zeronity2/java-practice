class MyT implements Runnable{
    public void run(){
        for(int i =0; i<5; i++){
            System.out.println(i);
        }
    }
}

class TestTthread{
    public static void main(String[] args){
        MyT obj = new MyT();
        Thread obj2 = new Thread(obj);
        obj2.start();
    }
}