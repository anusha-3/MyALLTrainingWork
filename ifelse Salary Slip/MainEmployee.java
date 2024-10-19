import java.util.*;
class MainEmployee{
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String employee = "Regular";
		
		if(employee == "Regular"){
			RegularEmployeeSalary regular = new RegularEmployeeSalary();
			regular.assigned(id, "Anusha Bera", "Software Engineer", 60000);
			regular.doPrint();
		}
		else{
			ContractualEmployeeSalary contractual = new ContractualEmployeeSalary();
			contractual.contractualEmpAssigned();
			contractual.contractualEmpInfo();
		}
	}
}