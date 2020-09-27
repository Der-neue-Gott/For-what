public class Specialist extends Employee {
	
	private int levels = 1;
	
		//геттеросеттеры
	public int getLevels() {
		return levels;
	}
	public void setLevels (int levels) {
		this.levels = levels;
	}
	
		//конструкторы
	public Specialist(int levels) {
		this.levels = levels;
	}
	public Specialist() {}
	
		//методы
	public void workWithClients() {
		System.out.println(" ' I am so busy of too many clients I have! ' ");
	}
	
}