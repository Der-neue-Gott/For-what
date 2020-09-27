public class Manager extends Employee {
	
	private boolean hasStocks = true;
	
		//геттеросеттеры
	public boolean isHasStocks() {
		return hasStocks;
	}
	public void setHasStocks(boolean hasStocks) {
		this.hasStocks = hasStocks;
	}
	
		//конструкторы
	public Manager(boolean hasStocks) {
		this.hasStocks = hasStocks;
	}
	public Manager() {}
	
		//методы
	public void writeProcedures() {
		System.out.println(" ' Did I say I was free? Don't disturb me! ' ");
	}
}