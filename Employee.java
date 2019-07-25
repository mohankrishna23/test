public class Employee {
	
	float salary = 40000;
	
}

class Associate extends Employee {
	
	float bonus = 10000;
	
	public static void main(String[] args) {
		
Associate income = new Associate();

System.out.println(income.salary);
System.out.println(income.bonus);
System.out.println("total income :"+(income.salary+income.bonus));
	
		
}
	
}