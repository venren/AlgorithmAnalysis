package Coderpad;

public class CustomMapTest {
    public static void main(String[] args) {
        CustomMap<String,Integer> cm = new CustomMap<>();
        cm.put("abc",1);
        cm.put("def",2);
        cm.put("fgh",3);
        cm.put("fgh",4);
        Integer id = cm.get("fgh");
        System.out.println(id);
    }
}
