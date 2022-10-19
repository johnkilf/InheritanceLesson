public class SalesPerson extends Employee {

    int numberOfItemsSold;
    int commissionPerItemSold = 100;

    public SalesPerson(int monthlySalary) {
        super(monthlySalary);
    }


    public void setNumberOfItemsSold(int numberOfItemsSold) {
        this.numberOfItemsSold = numberOfItemsSold;
    }

    @Override
    public int getYearlyCost() {

        return monthlySalary * 12 + (numberOfItemsSold * commissionPerItemSold);
    }


}
