
class Employee {
    int empId;
    String name;
    String designation;
    double salary;

    Employee(int id, String n, String d, double s) {
        empId = id;
        name = n;
        designation = d;
        salary = s;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new Employee(
            101, "Arun", "Manager", 35000.0
        );

        System.out.println("EMPLOYEE DETAILS");
        System.out.println("--------------------");

        e1.display();
    }
}