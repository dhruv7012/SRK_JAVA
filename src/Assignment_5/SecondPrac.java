package Assignment_5;

abstract class Employee {

    int EmpId;
    String EmpName;
    double Monthly_Salary;

    abstract double getNetSalary(double Salary);

    abstract void getEmployeeDetail(int EmpId);

}

class Clerk extends Employee {

    int EmpId;
    String EmpName;
    double Monthly_Salary;


    public Clerk(int EmpId, String EmpName, double Monthly_Salary) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.Monthly_Salary = Monthly_Salary;
    }

    @Override
    double getNetSalary(double Salary) {
        return Monthly_Salary * 12;
    }

    @Override
    void getEmployeeDetail(int CID) {

        if (EmpId == CID) {
            System.out.println("Clerk Details ");
            System.out.print("Clerk ID : ");
            System.out.println(EmpId);
            System.out.print("Clerk Name : ");
            System.out.println(EmpName);
            System.out.print("Clerk Monthly Salary : ");
            System.out.println(Monthly_Salary);
            System.out.print("Clerk package : ");
            System.out.println(getNetSalary(Monthly_Salary));
            System.out.println("=========================");
        } else {
            System.out.println("User Not Found");
        }
    }
}


class Manager extends Employee {

    int EmpId;
    String EmpName;
    double Monthly_Salary;

    public Manager(int EmpId, String EmpName, double Monthly_Salary) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.Monthly_Salary = Monthly_Salary;
    }


    @Override
    double getNetSalary(double Salary) {
        return Monthly_Salary * 12;
    }

    @Override
    void getEmployeeDetail(int MID) {

        if (EmpId == MID) {
            System.out.println("Manager Details ");
            System.out.print("Manager ID : ");
            System.out.println(EmpId);
            System.out.print("Manager Name : ");
            System.out.println(EmpName);
            System.out.print("Manager Monthly Salary : ");
            System.out.println(Monthly_Salary);
            System.out.print("Manager package : ");
            System.out.println(getNetSalary(Monthly_Salary));
            System.out.println("=========================");
        } else {
            System.out.println("User Not Found");
        }
    }
}


public class SecondPrac {
    public static void main(String[] args) {

        Clerk c = new Clerk(2,"Dhruv1",29600);
        c.getEmployeeDetail(2);

        Manager m = new Manager(3,"Dhruv2",19600);
        m.getEmployeeDetail(3);

    }

}
