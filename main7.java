import java.util.Scanner;
class Employee{
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}
    class Salary extends Employee{
        double basic;
        Salary(int id,String name,double basic){
            super(id,name);
            this.basic=basic;
        }
    }
    class Payroll extends Salary{
        Payroll(int id,String name,double basic){
            super(id,name,basic);
        }
        double CalculateGrossSalary(){
          return basic+0.20*basic+0.10*basic;
        }
    void displayDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.printf("Basic Salary: %.2f%n", basic);
        System.out.printf("Gross Salary: %.2f%n", CalculateGrossSalary());
    }
}

public class main7{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name:");
        String name=sc.nextLine();
        double basic=sc.nextDouble();
        Payroll p=new Payroll(id,name,basic);
        p.displayDetails();
        sc.close();
    }
}