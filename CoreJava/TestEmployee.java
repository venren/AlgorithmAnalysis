package CoreJava;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee.EmployeeBuilder("abc","xyz").gender('M').build();
        printEmployeeDetails(e1);
    }

    private static void printEmployeeDetails(Employee e1) {
        System.out.println("First Name of employee : " + e1.getFirstName());
        System.out.println("Last Name of employee : " + e1.getLastName());
        System.out.println("Gender of employee : " + e1.getGender());

    }
}
