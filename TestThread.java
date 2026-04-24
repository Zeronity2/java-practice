class MyT extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println(i);
        }
    }
}

class TestThread{
    public static void main(String[] args){
        MyT obj = new MyT();
        obj.start();
    }
}