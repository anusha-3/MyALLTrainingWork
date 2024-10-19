package p1;

public class RegularEmployee extends Employee {
    int basicSalary;

    public RegularEmployee(){

    }
    public RegularEmployee(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public RegularEmployee(int id, String name, int bankAccount, int basicSalary) {
        super(id, name, bankAccount);
        this.basicSalary = basicSalary;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
@Override
    public void creditSalary(){
        System.out.println("10% HRA credited");
        System.out.println("5% TAX deducted");

    }
}
