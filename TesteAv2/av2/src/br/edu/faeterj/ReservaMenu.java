package br.edu.faeterj;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class ReservaMenu {
    public List<Reserva> reservas = new ArrayList<>();
    private Scanner sc;
    int opcao;
    
    public ReservaMenu(Scanner sc) {
		this.sc = sc;
	}

    public void Processamento() {
        do {
            System.out.println("Digite a opcao:");
            System.out.println("1- Incluir Reserva: ");
            System.out.println("2- Alterar Reserva: ");
            System.out.println("3- Excluir Reserva: ");
            System.out.println("4- Listar Reservas: ");
            System.out.println("5- Sair ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    incluirReserva(sc);
                    break;
                case 2:
                    alterarReserva(sc);
                    break;
                case 3:
                    excluirReserva(sc);
                    break;
                case 4:
                    listarReservas();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        } while (opcao != 5);
        //sc.close();
    }
    
	public void incluirReserva(Scanner sc) {
    	int id;
    	int idQuarto;
    	int idCama;
        String cpfCliente= "";
        String dataEntrada= "";
        String dataSaida= "";
        String numeroCartao = "";
        String dataValidade = "";
        String codigoSeguranca = "";
        
        System.out.println("Digite o Id da Reserva: ");
        id = sc.nextInt();
        
        System.out.println("Digite o Id do Quarto: ");
        idQuarto = sc.nextInt();
        
        System.out.println("Digite o Id da Cama: ");
        idCama = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Digite o CPF do Cliente: ");
        cpfCliente = sc.nextLine();
        
        System.out.println("Digite a Data de entrada: ");
        dataEntrada = sc.nextLine();
       
        System.out.println("Digite a Data de saida: ");
        dataSaida = sc.nextLine();
        
        System.out.println("Digite o Número do Cartão: ");
        numeroCartao = sc.nextLine();

        System.out.println("Digite a Data de Validade (MM/AAAA): ");
        dataValidade = sc.nextLine();

        System.out.println("Digite o Código de Segurança (CVV): ");
        codigoSeguranca = sc.nextLine();
        
        Reserva reser = new Reserva (id, idQuarto, idCama, cpfCliente, dataEntrada, dataSaida, numeroCartao, dataValidade, codigoSeguranca);
        
        reservas.add(reser);
        System.out.println("\nReserva feita com sucesso !");
    }

    public void alterarReserva(Scanner sc) {
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
                
                sc.nextLine();
                System.out.println("Digite o novo cpf: ");
                String novoCpf = sc.nextLine();
                altReserva.setCpfCliente(novoCpf);
                
                System.out.println("Digite a nova Data de Entrada: ");
                String novaDataE = sc.nextLine();
                altReserva.setDataEntrada(novaDataE);
                
                System.out.println("Digite a nova Data de Saida: ");
                String novaDataS = sc.nextLine();
                altReserva.setDataSaida(novaDataS);
                
                System.out.println("Digite o novo numero do Cartao: ");
                String novoNumCartao = sc.nextLine();
                altReserva.setNumeroCartao(novoNumCartao);
                
                System.out.println("Digite a nova Data de Validade: ");
                String novaDataV = sc.nextLine();
                altReserva.setDataValidade(novaDataV);
                
                System.out.println ("Digite o Código de Segurança (CVV): ");
                String novoCVV= sc.nextLine();
                altReserva.setCodigoSeguranca(novoCVV);
                
                System.out.println("\nReserva alterada com sucesso !");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nao foi possivel localizar uma Reserva com este numero de Id");
        }
    }

    public void excluirReserva(Scanner sc) {
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
       	 System.out.println("Nao foi possivel localizar uma Reserva com este numero de Id");
        }
   }

    public void listarReservas() {
    	System.out.println("Reservas: \n");
    	System.out.println(reservas);
    }
}
