public class CEO extends Manager {
	
	private boolean hasCompanyCar = true;
	
		//геттеросеттеры
	public boolean isHasCompanyCar() {
		return hasCompanyCar;
	}
	public void setHasCompanyCar(boolean hasCompanyCar) {
		this.hasCompanyCar = hasCompanyCar;
	}
	
		//конструкторы
	public CEO(boolean hasCompanyCar) {
		this.hasCompanyCar = hasCompanyCar;
	}
	public CEO() {}
	
		//методы
	public void goPublic() {
		System.out.println(" ' Did I allow to enter? Close the door on the other side! ' ");
	}
}