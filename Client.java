package Prototype;

public class Client {
    public static void main(String args[]){
        StudentRegistry sr = StudentRegistry.getRegistryInstance();
        System.out.println("Registry object: "+sr);

        intializeStudentRegistry(sr);

        Student copySt = sr.get("Student").copy();//can also have this command in a loop to make multiple copies
        //we can change some values of the object in the copy object that we created.
        //changing batch id of the same student
        copySt.setBatchId("D3");

        System.out.println("Change in batch id for: "+copySt.getName()+" completed.");
        System.out.println("Original batch id: "+sr.get("Student").getBatchId()+"\nNew Batch id: "+copySt.getBatchId());

        Student copyIs = sr.get("IntelligentStudent").copy();
        copyIs.setName("Rithik");
        copyIs.setAge(24);
        copyIs.setBatchName("March22");
        copyIs.setBatchId("M1");
        ((IntelligentStudent)copyIs).setIq(190);

        System.out.println("We have a new Intelligent Student");
        System.out.println("Name: "+copyIs.getName()+", Age: "+copyIs.getAge()+", BatchName: "+copyIs.getBatchName()+", BatchId: "+copyIs.getBatchId()+", IQ: "+((IntelligentStudent)copyIs).getIq());

        //checking if we have Singleton implemented or not
        StudentRegistry sr2 = StudentRegistry.getRegistryInstance();
        System.out.println("Registry object validation: "+sr2);

    }
    public static void intializeStudentRegistry(StudentRegistry sr){
        Client obj = new Client();
        obj.setStudent(sr);
        obj.setIntelligentStudent(sr);
    }
    public void setStudent(StudentRegistry sr){
        Student st = new Student();
        st.setName("Rahul");
        st.setAge(22);
        st.setBatchName("Dec22");
        st.setBatchId("D1");
        sr.register("Student", st);
    }
    public void setIntelligentStudent(StudentRegistry sr){
        IntelligentStudent is = new IntelligentStudent();
        is.setName("Tanay");
        is.setAge(24);
        is.setBatchName("Feb22");
        is.setBatchId("F2");
        is.setIq(220);
        sr.register("IntelligentStudent", is);
    }
}
