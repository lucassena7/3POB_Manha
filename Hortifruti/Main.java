package br.edu.faeterj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carrinho menu = new Carrinho(sc);
        menu.Processamento();
        sc.close(); // Feche o Scanner somente quando não for mais necessário
	}
}
