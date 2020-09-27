public class Employee {
	
	private String nameEmployee;
	private int ageEmployee;
	private int salaryEmloyee;
	
		//геттеросеттеры
	public String getNameEmployee() {
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	
	public int getAgeEmployee() {
		return ageEmployee;
	}
	public void setAgeEmployee(int ageEmployee) {
		this.ageEmployee = ageEmployee;
	}
	
	public int getSalaryEmployee() {
		return salaryEmloyee;
	}
	public void setSalaryEmployee(int salaryEmloyee) {
		this.salaryEmloyee = salaryEmloyee;
	}
	
		//конструкторы
	public Employee(String nameEmployee, int ageEmployee, int salaryEmloyee) {
		this.nameEmployee = nameEmployee;
		this.ageEmployee = ageEmployee;
		this.salaryEmloyee = salaryEmloyee;
	}
	public Employee() {}
	
		//методы
	public void print(String nameEmployee, int ageEmployee, int salaryEmloyee) {
		System.out.println("Name: " + nameEmployee + ", " + ageEmployee + " years old | Salary: " + salaryEmloyee + " dollars");
	}
	
}