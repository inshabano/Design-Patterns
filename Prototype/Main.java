package Prototype;
import Prototype.Student.*;
import Prototype.IS.*;

public class Main {
    public static void main(String[] args) {
       Student s1 = new Student();
        s1.setAge(19);
        s1.setName("Rahul");
        s1.setBatch("Apr22");
        Student copy = s1.clone();
        Student is = new IS();
        is.setBatch("Mar22");
        is.setName("Karan");
        Student copyof = is.clone();
    }
}
