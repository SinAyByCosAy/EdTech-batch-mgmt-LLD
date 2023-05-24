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
        IntelligentStudent st = new IntelligentStudent();
        st.setName(this.getName());
        st.setAge(this.getAge());
        st.setBatchId(this.getBatchId());
        st.setBatchName(this.getBatchName());
        st.setIq(this.getIq());

        return st;
    }
}
