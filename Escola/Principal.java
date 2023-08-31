package br.edu.faeterj;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Entre com o nome da disciplina: ");
		String nome =dados.next();
		System.out.println ("Nome da disciplina:" + nome );
		
		
		System.out.println("Entre com a sigla da disciplina: ");
		String sigla =dados.next();
		System.out.println ("Sigla da disciplina:" + sigla );
		
		System.out.println("Entre com o periodo da disciplina: ");
		int periodo =dados.nextInt();
		System.out.println ("Periodo da disciplina:" + periodo );
		
		Disciplina disciplina = new Disciplina (nome, sigla, periodo);
		
		System.out.println("\nDados da Disciplina:");
        System.out.println("Nome: " + disciplina.getNome());
        System.out.println("Sigla: " + disciplina.getSigla());
        System.out.println("Periodo: " + disciplina.getPeriodo());
        
        //dados.close();
        
        System.out.println("------------------------------------------------------------------------------");
        
        System.out.println("Digite o nome do aluno: ");
        String nomeAlu = dados.next();

        System.out.println("Digite a matricula do aluno: ");
        int matriculaAlu = dados.nextInt();
        
        System.out.println("Digite a idade do aluno: ");
        int idadeAlu = dados.nextInt();
        
        dados.nextLine(); //Limpando o buffer
        
        System.out.println("Digite o genero do aluno: ");
        char generoAlu = dados.next().charAt(0);

        Aluno aluno = new Aluno(nomeAlu, matriculaAlu, generoAlu, idadeAlu);

        System.out.println("\nDados do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Genero: " + aluno.getGenero());
        System.out.println("Idade: " + aluno.getIdade());
        
        dados.close();
	}
}
