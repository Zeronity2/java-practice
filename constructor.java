class Student{
    int roll;
    String name;
    float marks;
    void getValue(int r, String n, float m){
        roll = r;
        name = n;
        marks = m;
    }

    void ShowValue(){
        System.out.println("the name is:"+name);
        System.out.println("the roll no. is:"+roll);
        System.out.println("the marks are:"+marks);
    }

    void grace(){
        if(marks > 80){
            marks = marks + 3;
        }
    }
}

class TestStudent{
    public static void main(String args[]){
        Student Khushi = new Student();
        Khushi.getValue(26,"Khushi",85);
        Khushi.grace();
        Khushi.ShowValue(); 
    }
} 