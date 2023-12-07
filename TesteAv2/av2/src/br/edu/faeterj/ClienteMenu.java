package br.edu.faeterj;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class ClienteMenu {
    public List<Cliente> clientes = new ArrayList<>();
    private Scanner sc;
    private int opcao;
    
    public ClienteMenu(Scanner sc) {
		this.sc = sc;
	}
    
    public void Processamento() {
        do {
            System.out.println("Digite a opcao:");
            System.out.println("1- Incluir Cliente: ");
            System.out.println("2- Alterar Cliente: ");
            System.out.println("3- Excluir Cliente: ");
            System.out.println("4- Listar Clientes: ");
            System.out.println("5- Sair ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    incluirCliente(sc);
                    break;
                case 2:
                    alterarCliente(sc);
                    break;
                case 3:
                    excluirCliente(sc);
                    break;
                case 4:
                    listarClientes();
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

	public void incluirCliente(Scanner sc) {
    	String nome= "";
        String endereco= "";
        String postalCode= "";
        String pais= "";
        String cpf= "";
        String passaporte= "";
        String email= "";
        String dataNascimento= "";
        
        // Validar dados
    	sc.nextLine(); // Consuma a nova linha pendente

        System.out.println("Digite seu Nome: ");
        nome = sc.nextLine();
        
        System.out.println("Digite seu Endereco: ");
        endereco = sc.nextLine();
        
        System.out.println("Digite seu Postal Code: ");
        postalCode = sc.nextLine();
        
        System.out.println("Digite seu Pais: ");
        pais = sc.nextLine();
        
        System.out.println("Digite seu CPF: ");
        cpf = sc.nextLine();
        
        System.out.println("Digite seu Passaporte: ");
        passaporte = sc.nextLine();
        
        System.out.println("Digite seu Email: ");
        email = sc.nextLine();
        
        System.out.println("Digite sua Data de Nascimento: ");
        dataNascimento = sc.nextLine();
        
        Cliente cli = new Cliente (nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento);
        
        clientes.add(cli);
        System.out.println("\nCliente inserido com sucesso !");
    }
    
    public void alterarCliente(Scanner sc) {
        String cpf;
        boolean encontrado = false;
        sc.nextLine();
        
        System.out.println("Digite o CPF de quem voce deseja alterar: ");
        cpf = sc.nextLine();
        
        for (Cliente altCliente : clientes) {
            if (altCliente.getCpf().equals(cpf)) {
            	System.out.println("Digite o novo nome: ");
                String novoNome = sc.nextLine();
                altCliente.setNome(novoNome);
                  
                System.out.println("Digite o novo Endereco: ");
                String novoEndereco = sc.nextLine();
                altCliente.setEndereco(novoEndereco);
                            
                System.out.println("Digite o novo Postal Code: ");
                String novoPostalCode = sc.nextLine();
                altCliente.setPostalCode(novoPostalCode);
                
                System.out.println("Digite o novo pais: ");
                String novoPais = sc.nextLine();
                altCliente.setPais(novoPais);
                        
                System.out.println("Digite o novo CPF: ");
                String novoCpf = sc.nextLine();
                altCliente.setCpf(novoCpf);
                
                System.out.println("Digite o novo Passaporte: ");
                String novoPassaporte = sc.nextLine();
                altCliente.setPassaporte(novoPassaporte);
                
                System.out.println("Digite o novo Email: ");
                String novoEmail = sc.nextLine();
                altCliente.setEmail(novoEmail);
                
                System.out.println("\nCliente alterado com sucesso !");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nao foi possivel localizar um Cliente com este numero de CPF");
        }
    }
    
    public void excluirCliente(Scanner sc) {
    	String cpf;
   	 	sc.nextLine();
   	 	System.out.println("Digite o CPF de quem voce deseja alterar: ");
   	 	cpf = sc.nextLine();
        
        boolean encontrado = false;

        for (int i = 0; i < clientes.size(); i++) {
            Cliente cli = clientes.get(i);
            
            if (cli.getCpf().equals(cpf)) {
                clientes.remove(i); 
                System.out.println("Cliente removido com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
       	 System.out.println("Nao foi possivel localizar um Cliente com este numero de matricula");
        }
   }
    
    public void listarClientes() {
    	System.out.println("Clientes: \n");
    	System.out.println(clientes);
    }

}
