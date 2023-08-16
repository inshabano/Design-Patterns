package Prototype;

public class IS extends Student{
    private int iq;

    public IS() {}

    public IS(IS is) {
        super(is);
        this.iq = is.iq;
    }



    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IS clone(){

//        IS is = new IS();
//        is.setAge(this.getAge());
//        is.setBatch(this.getBatch());
        return new IS(this);
    }
}
