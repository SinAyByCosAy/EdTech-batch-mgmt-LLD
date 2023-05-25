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

        Student is = new IntelligentStudent();
        is.setName("Tanay");
        is.setAge(24);
        is.setBatchName("Dec22");
        is.setBatchId("4");
        ((IntelligentStudent)is).setIq(100);
        Student copyIs = is.copy(); //copy of Intelligent Student will be called due to Run Time polymorphism
        System.out.println(copyIs.getName());
    }
}
