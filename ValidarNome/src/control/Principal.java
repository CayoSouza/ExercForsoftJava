package control;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Pessoa;

public class Principal {
	public static void main(String[] args) {
		new Principal().validarNomePessoa();;
	}
	
	public void validarNomePessoa(){
		//declaracao de variaveis
		Pessoa p;
		Scanner entrada = new Scanner(System.in);
		String regex = "^[a-zA-ZáàâãéèêíóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$";	//exemplo de filtro de caracteres, expressao regular
		Pattern pattern;
		Matcher matcher;
		
		System.out.print("Digite um nome: ");
		String nome = entrada.nextLine();	//captura a entrada 
		
		pattern = Pattern.compile(regex);	//representacao compilada da expressao regular
		matcher = pattern.matcher(nome);	//chama o "comparador" que vai buscar na variável nome a expressao regular
		
		p = new Pessoa();
		
		if(matcher.find())		//se achar, chama o setNome de Pessoa
			p.setNome(nome);
			
		System.out.println("O nome cadastrado em pessoa é "+ p.getNome());
		
		entrada.close();		//fecha o Scanner
	}

}
