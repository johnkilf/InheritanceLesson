import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee john = new Employee(2000);
        john.setDepartment("Sales");
        john.printDepartment();
        System.out.println("John's yearly cost is " + john.getYearlyCost());

        System.out.println();

        Programmer julia = new Programmer(2000);
        julia.setBonus(1000);
        julia.setDepartment("Payments");
        julia.printDepartment();
        julia.addProgrammingLanguage("java");
        julia.printProgrammingLanguages();
        System.out.println("Julia's yearly cost is " + julia.getYearlyCost());

        System.out.println();

        SalesPerson tim = new SalesPerson(3000);
        tim.setNumberOfItemsSold(4);
        System.out.println("Tim's yearly cost is " + tim.getYearlyCost());
    }
}















//    Employee john = new Employee();
//        john.setSalary(2000);
//
//                System.out.println("Employee cost is " + john.getYearlyCost());
//
//
//                Programmer jane = new Programmer();
//                jane.setSalary(2000);
//                jane.setBonus(500);
//
//                System.out.println("Programmer cost is " + jane.getYearlyCost());
//
//                ArrayList<Employee> employeeList = new ArrayList<Employee>();
//        employeeList.add(john);
//        employeeList.add(jane);