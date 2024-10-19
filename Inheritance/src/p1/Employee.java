package p1;

public class Employee {
    int id = 101;
    String name ="Anusha";
    int bankAccount = 123456789;

    public Employee() {
    }

    public Employee(int id, String name, int bankAccount) {
        this.id = id;
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void fillTimeSheet(){

    }
    public void creditSalary(){
        System.out.println("Salary Credited.");
    }
}
