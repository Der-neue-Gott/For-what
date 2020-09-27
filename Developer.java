public class Developer extends Employee {
	
	private String grades = "Middle";
	
		//геттеросеттеры
	public String getGrades() {
		return grades;
	}
	public void setGrades (String grades) {
		this.grades = grades;
	}
	
		//конструкторы
	public Developer(String grades) {
		this.grades = grades;
	}
	public Developer() {}
	
		//методы
	public void writeCode() {
		System.out.println(" ' I would like to answer you, but I can't understand where I missed one symbol.. ' ");
	}
}