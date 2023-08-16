package Builder;

public class Student {
    private String name;
    private int age;
    private String id;
    private String email;
    private int phone_no;
    private int grade_year;
    private Student(Builder builder){    // 3. need to hide the student constructor cus of null pointer exception.
        if(builder.getAge()>100){
            throw new IllegalCallerException("WRONG AGE");
        }
        if(builder.getGrade_year()>2027){
            throw new IllegalArgumentException("WRONG GRADE YEAR");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.email = builder.getEmail();
        this.grade_year = builder.getGrade_year();
        this.id = builder.getId();
        this.phone_no = builder.getPhone_no();
    }
    public static Builder getBuilder(){   //2
        return new Builder();
    }
    static class Builder {
        private String name;
        private int age;
        private String id;
        private String email;
        private int phone_no;
        private int grade_year;


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getPhone_no() {
            return phone_no;
        }

        public int getGrade_year() {
            return grade_year;
        }

        public String getEmail() {
            return email;
        }

        public String getId() {
            return id;
        }



        public Builder setPhone_no(int phone_no) {
            this.phone_no = phone_no;
            return this;
        }

        public Builder setGrade_year(int grade_year) {
            this.grade_year = grade_year;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Student build(){            //2
            return new Student(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public int getGrade_year() {
        return grade_year;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public void setGrade_year(int grade_year) {
        this.grade_year = grade_year;
    }


}
