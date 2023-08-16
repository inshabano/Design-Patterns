package Prototype;

public class Student implements Conable<Student>{
    private String name;
    private int Roll;
    private int age;
    private String batch;
    private int class_avg;
    private int counter;
    public Student(){}
    public Student (Student stu){            //copy constructor
        this.age = stu.age;
        this.Roll = stu.Roll;
        this.name = stu.name;
        this.class_avg = stu.class_avg;
        this.batch = stu.batch;
        this.counter = stu.counter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getClass_avg() {
        counter++;
        return class_avg;
    }

    public void setClass_avg(int class_avg) {
        this.class_avg = class_avg;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {return Roll;}

    public int getAge() {
        return age;
    }


    @Override
    public Student clone() {
//        Student clone = new Student();
//        clone.name =this.name;
//        clone.age = this.age;
//        clone.Roll = this.Roll;
//        clone.batch = this.batch;
//        clone.class_avg = this.class_avg;
//        return clone;
          return new Student(this);
    }
}
