class MyCustom extends Exception{
    MyCustom(String msg){
        super(msg);
    }
}

class TestUserException{
    public static void main(String[] args){
        double a, b, c;
        try{
            a=10;
            b= 5000;
            c=a/b;
            if(c<0.1){
                throw new MyCustom("Number too small");
            }
            else{
                System.out.println(c);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}