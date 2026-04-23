import java.io.*;
public class MyStudent implements Serializable{
    int id;
    String name;
    String pass;
    public MyStudent(int id, String name, String pass){
        this.id = id;
        this.name = name; 
        this.pass = pass;
    }
}