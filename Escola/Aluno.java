package br.edu.faeterj;

public class Aluno {
	private String nome;
	private int matricula;
	private char genero;
	private int idade;
	
	public Aluno(String nome, int matricula, char genero, int idade) {
		this.nome = nome;
		this.matricula = matricula;
		this.genero = genero;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
