public class Employee {
    int monthlySalary;
    String department = "Admin";

    public Employee(int monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public void setSalary(int monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printDepartment(){
        System.out.println("I work in department " + department);
    }

    public int getYearlyCost(){
        return monthlySalary * 12;
    }
}
