package control;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Pessoa;

public class Principal {
	public static void main(String[] args) {
		new Principal().validarNomePessoa();
	}
	
	public void validarNomePessoa(){
		//declaracao de variaveis
		Pessoa p;
		Scanner entrada = new Scanner(System.in);
		//exemplo de filtro de caracteres, expressao regular
		String regex = "^[a-zA-ZáàâãéèêíóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$";
		Pattern pattern;
		Matcher matcher;
		
		System.out.print("Digite um nome: ");
		//captura a entrada
		String nome = entrada.nextLine(); 
		
		//representacao compilada da expressao regular
		pattern = Pattern.compile(regex);
		//chama o "comparador" que vai buscar na variável nome a expressao regular
		matcher = pattern.matcher(nome);
		
		//instancia e associa pessoa
		p = new Pessoa();
		
		//se bater com o regex, retorna true, entao chama o setNome de Pessoa
		if(matcher.find())
			p.setNome(nome);
			
		System.out.println("O nome cadastrado em pessoa é "+ p.getNome());
		
		//fecha o Scanner
		entrada.close();
	}

}
