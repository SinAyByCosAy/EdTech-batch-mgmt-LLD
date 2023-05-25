package Prototype;

public class IntelligentStudent extends Student{
    private int iq;
    public void setIq(int iq){
        this.iq = iq;
    }
    public int getIq(){
        return iq;
    }
    public IntelligentStudent copy(){
        Student s = super.copy();
        ((IntelligentStudent)s).setIq(this.iq);
        return (IntelligentStudent)s;
    }
}
