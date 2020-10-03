// "Java – это C ++ без ружей, ножей и бейсбольных бит" - James Gosling

public class Main {
	public static void main(String[] args) {
		
	
	System.out.println("\t \t [~] KeyNote Industries [~]");
	System.out.println("Our Specialists:");
		Specialist specialist1 = new Specialist();
		Specialist specialist2 = new Specialist();
		Specialist specialist3 = new Specialist();
			specialist1.print("Stepan Akhmedovich", 24, 400);
			specialist2.print("Evgeniy Aleksandrovich", 22, 400);
			specialist3.print("Kubat Azizovich", 24, 400);
	System.out.println("They all have " + specialist1.getLevels() + " access level.");
	System.out.println("_____");
	System.out.print("Somewhere in the office you could hear: "); specialist1.workWithClients();
	
	
	System.out.println();
	System.out.println("Our Developers:");
		Developer developer1 = new Developer();
		Developer developer2 = new Developer();
		Developer developer3 = new Developer();
		Developer developer4 = new Developer();
			developer1.print("Oksana Aleksandrovna", 22, 800);
			developer2.print("Alexey Evgenievich", 21, 800);
			developer3.print("Aslanbek Umarovich", 24, 800);
			developer4.print("Mikhail Sergeevich", 22, 800);
	System.out.println("They all have " + developer1.getGrades() + " grade.");
	System.out.println("_____");
	System.out.print("Apparently, they are too busy for your questions: "); developer1.writeCode();

	
	System.out.println();
	System.out.println("Our Managers:");
		Manager manager1 = new Manager();
		Manager manager2 = new Manager();
			manager1.print("Ariana Beishievna", 25, 1100);
			manager2.print("Vladimir Akhmatovich", 27, 1100);
	System.out.println("Does they have a stocks? : " + manager1.isHasStocks());
	System.out.println("_____");
	System.out.print("It will be better if you sign up to them before you come: "); manager1.writeProcedures();
	
	
	System.out.println();
	System.out.println("Company Director");
		CEO director = new CEO();
			director.print("Azimkulovich Iskander Mirzaev", 32, 1500);
	System.out.println("Does he have a car? : " + director.isHasCompanyCar());
	System.out.println("_____");
	System.out.print("It will be better if you don't interfere with his work: "); director.goPublic();
	
	
	}
}