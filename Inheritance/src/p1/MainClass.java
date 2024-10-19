package p1;

public class MainClass {
    public static void main(String[] args){
        MainClass app = new MainClass();

        RegularEmployee regularEmployee = new RegularEmployee();
        regularEmployee.setBasicSalary(50000);

        ContractualEmployee contractualEmployee = new ContractualEmployee();
        contractualEmployee.setPerDayRates(5000);

        ThirdPartEmployee thirdPartEmployee = new ThirdPartEmployee();
        thirdPartEmployee.creditSalary();

        app.printEmployeeDetails(thirdPartEmployee);

    }
    public void printEmployeeDetails(Employee e){
        System.out.println("Employee Name: "+ e.getName());
        System.out.println("Employee id: "+ e.getId());
        System.out.println("Bank Account: "+ e.getBankAccount());

        if(e instanceof RegularEmployee)
        {
            RegularEmployee regularEmployee = (RegularEmployee) e;
            regularEmployee.creditSalary();
        }
        if(e instanceof ContractualEmployee)
        {
            ContractualEmployee contractualEmployee = (ContractualEmployee) e;
            contractualEmployee.creditSalary();
        }
    }
}
