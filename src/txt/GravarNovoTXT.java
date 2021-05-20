package txt;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe respons�vel por demonstrar a grava��o de arquivos TXT, levando em
 * considera��o que o processo abaixo sempre criar� um novo arquivo,
 * sobrescrevendo o anterior
 * 
 * @author Diego Munhoz
 * @since 08/03/2021
 * @version 1.0
 */
public class GravarNovoTXT {
	
	/*
	 * m�todo para gerar um arquivo txt
	 */
	public void gerarArquivoTxt(String nome) {
		
		try {
			// classe auxiliar para gerar o arquivo e seu conte�do
			PrintStream gravador = new PrintStream(nome);
			// objeto gravador possui o m�todo print para escrita de conte�do do arquivo
			gravador.println("PrintStream");
			gravador.println("A classe PrintStream possui um construtor que j�");
			gravador.println("recebe o nome de um arquivo como argumento.");
			gravador.println("");
			gravador.println("� importante lembra que o arquivo de sa�da");
			gravador.println("DEVE SER FECHADO usando o m�todo close().");
			// m�todo obrigat�rio para encerrar a grava��o do conte�do
			gravador.close();
			// exibindo resultado para o usuario
			JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso!", "Grava��o de Arquivo", 1);
			// encerrando a execu��o
			System.exit(0);
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Grava��o de Arquivo", 0);
			e.printStackTrace();
		}
		
	}// fim do m�todo
	
	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		new GravarNovoTXT().gerarArquivoTxt("saida.txt");
	}

}// fim da classe
