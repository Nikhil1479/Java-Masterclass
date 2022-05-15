public class Employee {
    public String name;
    public int Emp_ID;
    public double Basic_Salary;
    public double Gross_Salary;

    public String getName() {
        return name;
    }

    public int getEmp_ID() {
        return Emp_ID;
    }

    public double getBasic_Salary() {
        return Basic_Salary;
    }

    public double getGross_Salary() {
        return Gross_Salary;
    }

    public Employee(String name, int emp_ID, double basic_Salary) {
        this.name = name;
        Emp_ID = emp_ID;
        Basic_Salary = basic_Salary;
    }

    public double find_GrossSalary(){
        Gross_Salary = Basic_Salary;
        return Gross_Salary;
    }
}

class TechEmp extends Employee{
    private int year_of_Experience;
    public TechEmp(String name, int emp_ID, double basic_Salary, int year_of_Experience) {
        super(name, emp_ID, basic_Salary);
        this.year_of_Experience = year_of_Experience;
    }
    public double find_GrossSalary(){
        Gross_Salary = Basic_Salary + (Basic_Salary * 1.2) + (Basic_Salary * 0.15);
//        System.out.println("Gross Salary of TechEmp is: " + Gross_Salary);
        return Gross_Salary;
    }
}

class NotechEmp extends Employee{

    public int getYears_of_experience() {
        return years_of_experience;
    }

    public int years_of_experience;
    public NotechEmp(String name, int emp_ID, double basic_Salary, int years_of_Experience) {
        super(name, emp_ID, basic_Salary);
        this.years_of_experience = years_of_Experience;
    }

    public double find_GrossSalary(){
        Gross_Salary = Basic_Salary * years_of_experience;
//        System.out.println("Gross Salary of NoTechEmp is: " + Gross_Salary);
        return Gross_Salary;
    }
}

class Demo{
    public static void main(String[] args) {
        Employee techEmp = new TechEmp("Aryan", 1001, 5000, 5);
        System.out.println("Tech Employee Details");
        System.out.println("Employee name: " + techEmp.getName());
        System.out.println("Employee ID: " + techEmp.getEmp_ID());
        System.out.println("Employee Salary: " + techEmp.getBasic_Salary());
        System.out.println("Gross Salary: " + techEmp.find_GrossSalary());


        Employee noTechEmp = new NotechEmp("Nikhil", 1001, 4000, 3);
        System.out.println("\nNon Tech Employee Details");
        System.out.println("Employee Name: " + noTechEmp.getName());
        System.out.println("Employee ID: " + noTechEmp.getEmp_ID());
        System.out.println("Employee Salary: " + noTechEmp.getBasic_Salary());
        System.out.println("Gross Salary: " + noTechEmp.find_GrossSalary());
    }
}