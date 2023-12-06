package br.edu.faeterj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //CamaMenu kamaMenu = new CamaMenu(sc);
        //kamaMenu.Processamento();
        
        //QuartoMenu quartoMenu = new QuartoMenu(sc);
        //quartoMenu.Processamento();
        
        //ClienteMenu clienteMenu = new ClienteMenu(sc);
        //clienteMenu.Processamento();
        
        ReservaMenu reserMenu = new ReservaMenu(sc);
        reserMenu.Processamento();
        
        sc.close(); // Feche o Scanner somente quando não for mais necessário
    }
}