package poo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EscreverArquivoBufferedWriter {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\aluno\\Desktop\\dados\\funcionarios.csv";
		
		ArrayList<String> funcionarios = new ArrayList<>();
		
		funcionarios.add("nome,sobrenome,idade,salario");
		funcionarios.add("Paula,Nunes,27,25476.48");
		funcionarios.add("João,Silva,35,5000.27");
		funcionarios.add("Paulo,Santos,20,3750.00");
		funcionarios.add("Pedro,Moreira,51,13825.30");
		funcionarios.add("Géssica,Amorim,18,7375.88");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String linha : funcionarios) {
					bw.write(linha);
					bw.newLine();
			}
		} catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
		}
	}

}
