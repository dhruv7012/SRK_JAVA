package Assignment_5;


class EmployeeClass {
    static int empid;
    static String empname;
    static double salary;
    static double tax;

    EmployeeClass(int id, String name, double sal) {
        empid = id;
        empname = name;
        salary = sal;
        tax = CalculateTex(sal);
    }

    static double CalculateTex(double sal) {

        if (sal > 150000) {
            return ((sal - 150000)* 0.30 + (150000-60000)*0.20 +(10000)*0.1);
//            return ((sal - 150000)* 0.30 + (90000)*0.20 + (10000)*0.1);
        } else if (sal > 60000) {
            return ((sal - 60000)* 0.20 + (60000-50000)*0.10);
        } else if (sal > 50000) {
            return ((sal - 50000)* 0.10);
        } else {
            return 0;
        }

    }

    static void getEmployeeDetails() {
        System.out.println("Employee Details ");
        System.out.print("Employee ID : ");
        System.out.println(empid);
        System.out.print("Employee Name : ");
        System.out.println(empname);
        System.out.print("Employee Monthly Salary : ");
        System.out.println(salary);
        System.out.print("Employee Tax : ");
        System.out.println(tax);


    }
}

public class Fourth {

    public static void main(String[] args) {
        EmployeeClass e = new EmployeeClass(
                20,
                "dhruv",
//                75000
                150500
        );
        e.getEmployeeDetails();
    }
}
