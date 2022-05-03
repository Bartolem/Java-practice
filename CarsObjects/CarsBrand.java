package CarsObjects;
import java.util.Scanner;

public class CarsBrand {		
	
	public static void main(String[] args) {
		Cars Bmw = new Cars();
		Bmw.name = "BMW";
		Bmw.type = "sedan";
		Bmw.engine = "gasoline";
		Bmw.model = "e36";
		Bmw.productionDate = 1993;
		Bmw.power = 150;
		
		Cars Audi = new Cars();
		Audi.name = "Audi";
		Audi.type = "sedan";
		Audi.engine = "gasoline";
		Audi.model = "A4";
		Audi.productionDate = 1996;
		Audi.power = 140;
		
		Cars Volkswagen = new Cars();
		Volkswagen.name = "Volkswagen";
		Volkswagen.type = "hatchback";
		Volkswagen.engine = "diesel";
		Volkswagen.model = "Golf 3";
		Volkswagen.productionDate = 1995;
		Volkswagen.power = 114;
		
		Cars Opel = new Cars();
		Opel.name = "Opel";
		Opel.type = "hatchback";
		Opel.engine = "diesel";
		Opel.model = "Astra A";
		Opel.productionDate = 1999;
		Opel.power = 80;
		
		Cars Lada = new Cars();
		Lada.name = "Lada";
		Lada.type = "sedan";
		Lada.engine = "gasoline";
		Lada.model = "2107";
		Lada.productionDate = 1983;
		Lada.power = 68;			
		
		String[] carsName = new String[5];
		carsName[0] = Bmw.name + " " + Bmw.model;
		carsName[1] = Audi.name + " " + Audi.model;
		carsName[2] = Volkswagen.name + " " + Volkswagen.model;
		carsName[3] = Opel.name + " " + Opel.model;
		carsName[4] = Lada.name + " " + Lada.model;
		
		Scanner input = new Scanner(System.in);
		System.out.println("1.Poka¿ listê dostêpnych aut\n"
				+ "2.Wyjdz z programu");
		int option1 =  input.nextInt();
		
		
		if(option1 == 1) {
			for(int i = 0; i < carsName.length; i++) {
				System.out.println((i + 1 )+ "." + carsName[i]);
			}
			System.out.println("Wpisz cyfrê od 1 do 5,"
					+ " by otrzymaæ wiêcej szczegó³ów o danym pojezdzie");
			int option2 = input.nextInt();
			switch(option2){
				case 1:{
					Bmw.showEngine();
					Bmw.showProductionDate();
					break;
				}
				case 2:{
					Audi.showEngine();
					Audi.showProductionDate();
					break;
				}
				case 3:{
					Volkswagen.showEngine();
					Volkswagen.showProductionDate();
					break;
				}
				case 4:{
					Opel.showEngine();
					Opel.showProductionDate();
					break;
				}
				case 5:{
					Lada.showEngine();
					Lada.showProductionDate();
					break;
				}
				default:{
					System.out.println("Nieprawid³owe dane, wpisz cyfrê od 1 do 5");
				}
			}
			
		}
		else if(option1 == 2) {
			System.exit(0);
		}
		input.close();
	}				
}
