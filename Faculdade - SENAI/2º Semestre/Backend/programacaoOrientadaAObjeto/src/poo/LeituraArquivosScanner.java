package poo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeituraArquivosScanner {

	public static void main(String[] args) {
		
		File path = new File("C:\\Users\\Aluno\\Desktop\\dados\\funcionarios.csv");
		Scanner scan = null;
		
		try {
			scan = new Scanner (path);
			while (scan.hasNextLine()){
				System.out.println(scan.nextLine());
			}
		}catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			if(scan != null) scan.close();
		}
	}

}
