package CoreJava;

import java.io.Serializable;

public class BaseEmp implements Serializable,Comparable {

    private String firstName;
    private int age;
    private int baseSal;
    private int experience;

    @Override
    public int compareTo(Object o) {
        if(o == null) return 0;
        BaseEmp emp = (BaseEmp)o;
        return age - emp.age;
    }
}
