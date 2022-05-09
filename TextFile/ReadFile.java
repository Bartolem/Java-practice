import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadFile {

	public static void main(String[] args) throws IOException{
		File plik = new File("PlikTestowy.txt");
		
		if (plik.exists()) {
			Scanner inputFile = new Scanner(plik);
			System.out.println(inputFile.nextLine());
			inputFile.close();
		}
		else {
			JOptionPane.showMessageDialog(null, "Taki plik nie istnieje");
		}
	}

}
