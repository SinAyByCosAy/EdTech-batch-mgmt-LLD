package Prototype;

import java.util.HashMap;

public class StudentRegistry {
    static StudentRegistry instance;
    private StudentRegistry(){}
    public static StudentRegistry getRegistryInstance(){
        if(instance==null) {//not thread safe currently
            instance = new StudentRegistry();
            return instance;
        }
        return instance;
    }
    HashMap<String, Student> registryValues = new HashMap<>();
    void register(String key, Student s){
        registryValues.put(key, s);
    }

    Student get(String key){
        return registryValues.get(key);
    }
}
