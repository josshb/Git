package control;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		File fs = new File("alfabeto.txt");
		FileWriter fw = null;
		PrintWriter pw = null ;
		try {
			fw = new FileWriter(fs);
			pw = new PrintWriter(fw);
			for(char letra='a'; letra<='z';letra++){
				System.out.println(letra);
				pw.println(letra);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			pw.close();
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
