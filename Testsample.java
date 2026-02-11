class Sample{
    int a, b;
    Sample(){
        a = 0;
        b = 0;
    }
    Sample(int x, int y){
        a = x;
        b = y;
    }
    Sample(Sample ob){
        a = ob.a;
        b = ob.b;
    }
    void display(){
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
    }
}

public class Testsample{
    public static void main(String[] args){
        Sample obj1 = new Sample();
        Sample obj2 = new Sample(4,5);
        Sample obj3 = new Sample(obj2);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}

