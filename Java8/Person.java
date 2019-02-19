package Java8;

public class Person extends Homosapiens {
    private String name;
    private Integer age;
    private Integer experience;

    public Person(String name, Integer age, Integer experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public Integer getAge() {
        return age;
    }
}
