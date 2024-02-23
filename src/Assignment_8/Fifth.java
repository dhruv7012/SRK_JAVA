package Assignment_8;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

interface EmployeeFilter {
    boolean filter(Employee emp);
}

class Employee {
    int EmpID;
    String EmpName;
    String Department;
    double Salary;
    double TotalYearsOfExperiance;

    Employee(int EmpID, String EmpName, String Department, double Salary, double TotalYearsOfExperiance) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.Department = Department;
        this.Salary = Salary;
        this.TotalYearsOfExperiance = TotalYearsOfExperiance;
    }
}

public class Fifth {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Details for filter. (Enter 0 if you dont want to apply that filter) ");

        System.out.print("Enter Department : ");

        String Department = sc.next();

        System.out.print("Enter Minimum Salary : ");
        double MinSalary = sc.nextDouble();

        System.out.print("Enter Maximum Salary : ");
        double MaxSalary = sc.nextDouble();

        System.out.print("Enter Minimum Year of Experiance : ");
        double TotalYearsOfExperiance = sc.nextDouble();

        Employee e1 = new Employee(0, "Dhruv", "IT", 60000.0, 5);
        employeeList.add(e1);

        Employee e2 = new Employee(1, "Ankit", "CSE", 90000.0, 15);
        employeeList.add(e2);

        Employee e3 = new Employee(2, "Mehar", "IT", 30000.0, 3);
        employeeList.add(e3);

        Employee e4 = new Employee(3, "Jeet", "CSE", 190000.0, 17);
        employeeList.add(e4);
        EmployeeFilter e = emp -> {

            if (!Objects.equals(Department, "0")) {
                employeeList.removeIf(i -> !Objects.equals(i.Department, Department));
            }
            if (MinSalary != 0) {
                employeeList.removeIf(i -> !(i.Salary >= MinSalary));
            }
            if (MaxSalary != 0) {
                employeeList.removeIf(i -> !(i.Salary <= MaxSalary));
            }
            if (TotalYearsOfExperiance != 0) {
                employeeList.removeIf(i -> !(i.TotalYearsOfExperiance >= TotalYearsOfExperiance));
            }

            return true;
        };

        e.filter(e1);

        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(
                    "{ EmployeeId : " + employeeList.get(i).EmpID+
                    ", Employee Name : " + employeeList.get(i).EmpName +
                    ", Employee Salary : " + employeeList.get(i).Salary +
                    ", Employee Department : " + employeeList.get(i).Department +
                    ", Employee Total Experiance : " + employeeList.get(i).TotalYearsOfExperiance + " }\n");

        }

    }
}
