import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		PrintWriter outputFile = new PrintWriter("PlikTestowy.txt");
		
		outputFile.print("Pusty plik nic tu ni ma");
		
		outputFile.close();
	}

}
