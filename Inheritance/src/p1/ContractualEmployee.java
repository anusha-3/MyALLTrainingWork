package p1;

public class ContractualEmployee extends Employee{
    int perDayRates;

    public ContractualEmployee(int perDayRates) {
        this.perDayRates = perDayRates;
    }

    public ContractualEmployee(int id, String name, int bankAccount, int perDayRates) {
        super(id, name, bankAccount);
        this.perDayRates = perDayRates;
    }

    public ContractualEmployee() {

    }

    public int getPerDayRates() {
        return perDayRates;
    }

    public void setPerDayRates(int perDayRates) {
        this.perDayRates = perDayRates;
    }
@Override
    public void creditSalary(){
    System.out.println("Per Day rate: "+ perDayRates);
    System.out.println("Total Salary Credited: "+ perDayRates*22);
    System.out.println("10% TDS Amount: "+ ((perDayRates*22)*10)/100);
    }
}
