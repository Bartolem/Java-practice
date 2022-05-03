package CarsObjects;

public class Cars {
	String name;
	String type;
	String engine;
	String model;
	int productionDate;
	int power;
	boolean isProduced;
	
	public void showProductionDate() {
		System.out.println(name + " " + model + " Zosta³ wyprodukowany w " + productionDate + "r");
		
		if(isProduced == true) {
			System.out.println("Aktualnie jest ci¹gle produkowany");
		}
		else {
			System.out.println("Aktualnie nie jest ju¿ produkowany");
		}
		System.out.println();
	}
	
	public void showEngine() {
		if(engine == "gasoline") {
			engine = "benzynowy";
		}
		else {
			engine = "diesla";
		}
		
		System.out.println(name + " " + model + " Posiada silnik " + engine + " " + "o mocy " + power + "KM");
	}
}
