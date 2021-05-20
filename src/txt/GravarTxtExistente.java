package txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe respons�vel por demonstrar a grava��o de arquivo TXT, se o arquivo for
 * existente, mantem o conteudo, caso n�o exista criar� um novo arquivo
 * 
 * @author Diego Munhoz
 * @since 08/03/2021
 * @version 1.0
 */
public class GravarTxtExistente {
	
	/*
	 * m�todo para criar arquivo TXT recebendo o nome
	 */
	public void gravarArquivo(String nome) {
		
		// classe auxiliar para carregar um arquivo existente ou criar um novo arquivo
		File arquivo = new File(nome);
		
		try {
			// classe auxiliar para gerar um objeto de mem�ria para grava��o do arquivo
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			
			// classe auxiliar para gerar o arquivo e seu conte�do
			PrintStream gravador = new PrintStream(arquivoOutput);
			
			// gravando o conte�do do arquivo
			gravador.println("FileOutputStream");
			gravador.println("Utilizando o FileOutputStream � poss�vel");
			gravador.println("abrir um arquivo e gravar os dados");
			gravador.println("sem necessariamente sobrescrever o arquivo existente.");
			gravador.println("");
			gravador.println("Neste exemplo al�m de fechar o objeto gravador com o m�todo close");
			gravador.println("tamb�m � necess�rio fechar o arquivoOutput.");
			
			// fechando o processo de grava��o
			gravador.close();
			arquivoOutput.close();
			
			// informando ao usuario a finaliza��o do processo de grava��o
			JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso!", "Grava��o de Arquivo", 1);
			
			// encerrando o processamento
			System.exit(0);
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Grava��o de Arquivo", 0);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Grava��o de Arquivo", 0);
			e.printStackTrace();
		}
		
	}// fim do m�todo
	
	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		new GravarTxtExistente().gravarArquivo("saida.txt");
	}

}// fim da classe
