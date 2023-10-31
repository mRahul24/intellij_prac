package oct28;

public class EmployeeMain {
    public static void main(String[] args) {
//        Employee employee = new Employee("Rahul", "R@gmail.com");
//        employee.getEmail();

        Employee<Integer, String > employee = new Employee<>(101, "R@gmail.com");
        Object email = employee.getEmail();
    }
}
