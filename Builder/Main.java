package Builder;

public class Main {
    public static void main(String[] args) {
        //1.
//        Builder b = new Builder();
//        b.setName("aman");
//        b.setGrade_year(2028);
//        b.setAge(23);
//        Student s = new Student(b);
//        System.out.println(s.getAge());
//        System.out.println(s.getGrade_year());
//          2
//        Builder builder = Student.getBuilder();
//        builder.setName("bmdf");
//        builder.setId("A203");
//        Student student = builder.build();
         //3
        Student stu = Student.getBuilder()
                .setName("hsfdhb")
                .setAge(18)
                .setEmail("gfast25@gmail.com")
                .build();
    }
}
