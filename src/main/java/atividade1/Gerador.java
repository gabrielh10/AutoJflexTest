package atividade1;

import java.io.File;

public class Gerador {
		public static void main(String[] args) {
			String loginAluno = "";
			String path = "src/main/resources/";   //caminho pra pasta do arquivo
			String arquivo = path + loginAluno;      // nome do arquivo
			File file = new File(arquivo);	
			jflex.Main.generate(file);	
		}
	}
