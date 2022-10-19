import java.util.ArrayList;
import java.util.List;

public class Programmer extends Employee {

    int bonus;

    ArrayList<String> programmingLanguages = new ArrayList<>();

    public Programmer(int monthlySalary){
        super(monthlySalary);
    }


    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void addProgrammingLanguage(String language){
        this.programmingLanguages.add(language);
    }

    public void printProgrammingLanguages(){
        System.out.println(programmingLanguages);
    }

    @Override
    public int getYearlyCost(){

        int valueFromEmployee = super.getYearlyCost();

        return valueFromEmployee + bonus;
    }

}
