package br.edu.faeterj;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class ReservaMenu {
    private List<Reserva> reservas = new ArrayList<>();
    private Scanner sc;
    
    public void incluirReserva(Reserva reserva) {
    	int id;
    	int idQuarto;
    	int idCama;
        String cpfCliente= "";
        String dataEntrada= "";
        String dataSaida= "";
        
        System.out.println("Digite o Id da Reserva: ");
        id = sc.nextInt();
        
        System.out.println("Digite o Id do Quarto: ");
        idQuarto = sc.nextInt();
        
        System.out.println("Digite o Id da Cama: ");
        idCama = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Digite o CPF do Cliente: ");
        cpfCliente = sc.nextLine();
        
        sc.nextLine();
        System.out.println("Digite a Data de entrada: ");
        dataEntrada = sc.nextLine();
        
        sc.nextLine();
        System.out.println("Digite a Data de saida: ");
        dataSaida = sc.nextLine();
        
        Reserva reser = new Reserva (id, idQuarto, idCama, cpfCliente, dataEntrada, dataSaida);
        
        reservas.add(reser);
        System.out.println("\nReserva feita com sucesso !");
    }

    public void AlterarReserva(Reserva reserva) {
        int id;
        boolean encontrado = false;
        sc.nextLine();
        
        System.out.println("Digite o Id da reserva que voce deseja alterar: ");
        id = sc.nextInt();
        
        for (Reserva altReserva : reservas) {
            if (altReserva.getId() == (id)) {
            	System.out.println("Digite o novo Id do Quarto da reserva: ");
                int novoIdQReserva = sc.nextInt();
                altReserva.setIdQuarto(novoIdQReserva);
                
                System.out.println("Digite o novo Id da Cama da reserva: ");
                int novoIdCReserva = sc.nextInt();
                altReserva.setIdCama(novoIdCReserva);
                
                System.out.println("Digite o novo cpf: ");
                String novoCpf = sc.nextLine();
                altReserva.setCpfCliente(novoCpf);
                
                System.out.println("Digite a nova Data de Entrada: ");
                String novaDataE = sc.nextLine();
                altReserva.setDataEntrada(novaDataE);
                
                System.out.println("Digite a nova Data de Saida: ");
                String novaDataS = sc.nextLine();
                altReserva.setDataSaida(novaDataS);
                
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nao foi possivel localizar uma Reserva com este numero de Id");
        }
    }

    public void excluirReserva(Reserva reserva) {
    	int id;
    	boolean encontrado = false;
    	
   	 	System.out.println("Digite o Id da Reserva que voce deseja excluir: ");
   	 	id = sc.nextInt();

        for (int i = 0; i < reservas.size(); i++) {
            Reserva reser = reservas.get(i);
            
            if (reser.getId() == (id)) {
                reservas.remove(i); 
                System.out.println("Reserva removida com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
       	 System.out.println("Nao foi possivel localizar uma Resera com este numero de Id");
        }
   }

    public void listarReservas() {
    	System.out.println("Reservas: \n");
    	System.out.println(reservas);
    }
}
