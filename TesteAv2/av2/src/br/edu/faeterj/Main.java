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

        //ReservaMenu reserMenu = new ReservaMenu(sc);
        //reserMenu.Processamento();
        
        //Instâncias das classes de menu
        ClienteMenu clienteMenu = new ClienteMenu(sc);
        QuartoMenu quartoMenu = new QuartoMenu(sc);
        CamaMenu camaMenu = new CamaMenu(sc);
        ReservaMenu reservaMenu = new ReservaMenu(sc);
        
        //Instâncias de quartos
        Quarto quarto1 = new Quarto(1, "Rubro", 4, true, "Quarto de luxo com vista para o mar - frente , sol da manha");
        Quarto quarto2 = new Quarto(2, "Negro", 8, false, "Quarto de luxo - fundos, sol da tarde");
        Quarto quarto3 = new Quarto(3, "Raça", 12, true, "Quarto de luxo com vista lateral para o mar - lateral, sol da tarde, ");
        
        //Adicionando os quartos na lista
        quartoMenu.quartos.add(quarto1);
        quartoMenu.quartos.add(quarto2);
        quartoMenu.quartos.add(quarto3);
        
        //Instâncias de camas
        Cama cama1 = new Cama(1, 101, false, "Cama de solteiro", "Cama confortável para uma pessoa");
        Cama cama2 = new Cama(2, 102, true, "Beliche em cima", "Colchao ortopedico");
        Cama cama3 = new Cama(3, 103, false, "Cama de casal", "Cama espaçosa para casal");
        Cama cama4 = new Cama(4, 104, false, "Cama de solteiro", "Cama confortável para uma pessoa");
        Cama cama5 = new Cama(5, 105, true, "Beliche embaixo", "Colchao ortopedico");
        
        //Adicionando as camas na lista
        camaMenu.camas.add(cama1);
        camaMenu.camas.add(cama2);
        camaMenu.camas.add(cama3);
        camaMenu.camas.add(cama4);
        camaMenu.camas.add(cama5);
        
        //Exibindo os quartos e camas disponíveis:
        System.out.println ("\nQuartos disponiveis: \n");
        quartoMenu.listarQuartos();
        System.out.println ("\nCamas disponiveis: \n");
        camaMenu.listarCamas();
        
        
        //Instâncias de clientes
        Cliente cliente1 = new Cliente("Diego Ribas", "Rua F, 3Libertas", "12345", "Brasil", "12345678901", "ABCD1234", "dRibas@email.com", "28/02/1985");
        Cliente cliente2 = new Cliente("Filipe Luis", "Rua L 8Brasileiros", "67890", "Brasil", "98765432101", "EFGH5678", "fLuis@example.com", "09/08/1985");
        Cliente cliente3 = new Cliente("Rodrigo Caio","Rua A 4CopasBrasil", "54321", "Brasil", "12312312312", "IJKL91011", "rCaio@example.com", "17/08/1993");

        //Adicionando clientes na lista
        clienteMenu.clientes.add(cliente1);
        clienteMenu.clientes.add(cliente2);
        clienteMenu.clientes.add(cliente3);
        
        //instâncias de reservas
        Reserva reserva1 = new Reserva(1, 1, 4, "12345678901", "10-12-2023", "15-12-2023", "123456","07/05/2028","332");
        Reserva reserva2 = new Reserva(2, 2, 5, "12312312312", "12-12-2023", "22-12-2023","789101" ,"09/07/2030","157");

        // Adicionando reservas na lista
        reservaMenu.reservas.add(reserva1);
        reservaMenu.reservas.add(reserva2);
        
        //Exibindo as reservas
        System.out.println ("\nReservas feitas: \n");
        reservaMenu.listarReservas();
        
        sc.close(); // Feche o Scanner somente quando não for mais necessário
    }
}