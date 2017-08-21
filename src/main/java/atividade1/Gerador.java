package atividade1;

import java.io.File;

/* Após implementar as suas regras léxicas no arquivo exemplo.jflex que está em src/main/resources rode essa classe "Gerador"
   e então a classe Minijava será gerada na pasta resources.
 */

public class Gerador {
		public static void main(String[] args) {
			String loginAluno = "exemplo";  
			String path = "src/main/resources/";   
			String arquivo = path + loginAluno + "jflex";    
			File file = new File(arquivo);	
			jflex.Main.generate(file);	
		}
	}
