import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		String length = "length";
		String width = "width";
		String height = "height";
		String weight = "weight";
		int palletChoose;
		
		Map<String,Integer> euro1 = new HashMap<>();
		euro1.put(length,1200);
		euro1.put(width, 800);
		euro1.put(height,144);
		euro1.put(weight, 25);
		
		Map<String,Integer>euro2 = new HashMap<>();
		euro2.put(length, 1000);
		euro2.put(width, 800);
		euro2.put(height, 144);
		euro2.put(weight, 20);
		
		Map<String,Integer>euro3 = new HashMap<>();
		euro3.put(length, 800);
		euro3.put(width, 800);
		euro3.put(height, 144);
		euro3.put(weight, 15);
		
		int palletLenght = 34; 
		
		
		
		System.out.printf("%40s","-------------------------\n");
		System.out.printf("%40s","Wybierz rodzaj palety: \n");
		System.out.printf("%40s","-------------------------\n");
		System.out.printf("%25s %s","1.Euro (1)","1200x800x144 25kg\n");
		System.out.printf("%25s %s","2.Euro (2)","1000x800x144 20kg\n");
		System.out.printf("%25s %s","3.Euro (3)","800x800x144 15kg\n");
		
		Scanner input = new Scanner(System.in);
		palletChoose = input.nextInt();
		
		if(palletChoose == 1) {		 
			//wyliczanie u¿ywajac palety euro1
		}
		else if(palletChoose == 2) {
			//wylicznie u¿ywaj¹c palety euro2
		}
		else if(palletChoose == 3) {
			//wyliczanie u¿ywaj¹c palety euro3
		}
		else {
			System.out.println("Podana nieprawid³owa wartoœæ");
		}
	}

}
