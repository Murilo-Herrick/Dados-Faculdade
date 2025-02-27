package poo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerAquivoBufferedReaderV1 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Aluno\\Desktop\\dados\\funcionarios.csv";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				
			} catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}
	}

}
