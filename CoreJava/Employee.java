package CoreJava;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final Character gender;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Character getGender() {
        return gender;
    }

    private Employee(EmployeeBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
    }

    public static class EmployeeBuilder{
        private String firstName;
        private String lastName;
        private Character gender;

        public EmployeeBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public EmployeeBuilder gender(Character gender) {
            this.gender = gender;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
