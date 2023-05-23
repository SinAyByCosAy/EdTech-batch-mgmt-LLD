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
    }
}
