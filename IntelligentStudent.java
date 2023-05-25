package Prototype;

public class IntelligentStudent extends Student{
    private int iq;
    public void setIq(int iq){
        this.iq = iq;
    }
    public int getIq(){
        return iq;
    }

    public IntelligentStudent(){}
    public IntelligentStudent(IntelligentStudent is){
        super(is); //calling copy constructor of parent
        this.iq = is.iq;
    }
    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }
}
