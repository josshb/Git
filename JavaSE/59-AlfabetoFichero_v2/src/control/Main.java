package control;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		File fs = new File("alfabeto1.txt");

		try (FileWriter fw = new FileWriter(fs); 
			 PrintWriter pw = new PrintWriter(fw);
			) {

			for (char letra = 'a'; letra <= 'z'; letra++) {
				System.out.println(letra);
				pw.println(letra);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
