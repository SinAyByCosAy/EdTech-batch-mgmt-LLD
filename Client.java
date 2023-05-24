package Prototype;

public class Client {
    public static void main(String args[]){
        Student st = new Student();
        st.setName("Rahul");
        st.setAge(21);
        st.setBatchId("3");
        st.setBatchName("Nov22");

        Student copySt = st.copy();
        System.out.println(copySt.getName());

        Student st2 = new IntelligentStudent();
        st2.setName("BAC");
        st2.setAge(24);
        st2.setBatchName("Dec22");
        st2.setBatchId("4");
        ((IntelligentStudent)st2).setIq(100);
        System.out.println(((IntelligentStudent) st2).getIq());
        Student st3 = st2.copy();
        System.out.println(st3);
    }
}
