package br.edu.faeterj;

import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Menu {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Scanner sc;
    private int opcao;
    
    public Menu(Scanner sc) {
    	this.sc = sc;
    }

    public void Processamento() {
        do {
            System.out.println("Digite a opcao:");
            System.out.println("1- Incluir Aluno: ");
            System.out.println("2- Alterar Aluno: ");
            System.out.println("3- Excluir Aluno: ");
            System.out.println("4- Listar Alunos: ");
            System.out.println("5- Buscar Aluno: ");
            System.out.println("6- Sair ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    IncluirAluno(sc);
                    break;
                case 2:
                    AlterarAluno(sc);
                    break;
                case 3:
                    ExcluirAluno(sc);
                    break;
                case 4:
                    ListarAlunos();
                    break;
                case 5:
                    BuscarAluno();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        } while (opcao != 6);
        //sc.close();
    }

    public void IncluirAluno(Scanner sc) {
        String nome = "";
        String cpf;
        String dtAux;
        String matricula;
        String endereco;
        String cep;

        sc.nextLine(); // Consuma a nova linha pendente

        System.out.println("Digite seu primeiro nome: ");
        nome = sc.nextLine();

        System.out.println("Digite seu CPF (somente os numeros): ");
        cpf = sc.nextLine();

        System.out.println("Digite sua data de nascimento (dd/mm/aaaa): ");
        dtAux = sc.nextLine();

        System.out.println("Digite sua matricula: ");
        matricula = sc.nextLine();

        System.out.println("Digite seu Endereco: ");
        endereco = sc.nextLine();

        System.out.println("Digite seu CEP (somente os numeros): ");
        cep = sc.nextLine();

        Aluno alun = new Aluno(nome, cpf, matricula, dtAux, endereco, cep);

        alunos.add(alun);
        System.out.println("\nAluno inserido com sucesso !");
    }

    public void AlterarAluno(Scanner sc) {
        String matri;
        boolean encontrado = false;
        sc.nextLine();
        System.out.println("Digite a matricula de quem voce deseja alterar: ");
        matri = sc.nextLine();

        for (Aluno altAluno : alunos) {
            if (altAluno.getMatricula().equals(matri)) {
            	System.out.println("Digite o novo nome: ");
                String novoNome = sc.nextLine();
                altAluno.setNome(novoNome);
                  
                System.out.println("Digite o novo CPF: ");
                String novoCpf = sc.nextLine();
                altAluno.setCpf(novoCpf);
                            
                System.out.println("Digite a nova data de nascimento (dd/mm/aaaa): ");
                String novaDataNascimento = sc.nextLine();
                altAluno.setDtNasc(novaDataNascimento);
                
                System.out.println("Digite o novo endereco: ");
                String novoEndereco = sc.nextLine();
                altAluno.setEndereco(novoEndereco);
                        
                System.out.println("Digite o novo CEP: ");
                String novoCep = sc.nextLine();
                altAluno.setCep(novoCep);
                
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nao foi possivel localizar um aluno com este numero de matricula");
        }
}

    public void ExcluirAluno(Scanner sc) {
    	 sc.nextLine();
         System.out.println("Digite a matricula de quem voce deseja excluir: ");
         String matri = sc.nextLine();
         
         boolean encontrado = false;

         for (int i = 0; i < alunos.size(); i++) {
             Aluno aluno = alunos.get(i);
             
             if (aluno.getMatricula().equals(matri)) {
                 alunos.remove(i); 
                 System.out.println("Aluno removido com sucesso!");
                 encontrado = true;
                 break;
             }
         }
         if (!encontrado) {
        	 System.out.println("Nao foi possivel localizar um aluno com este numero de matricula");
         }
    }

    public void ListarAlunos() {
    	System.out.println("Alunos: ");
    	System.out.println(alunos);
    }

    public void BuscarAluno() {
        sc.nextLine();
        System.out.println("Digite a matricula de quem voce deseja buscar: ");
        String matri = sc.nextLine();
        
        boolean encontrado = false;

        for (Aluno altAluno : alunos) {
            if (altAluno.getMatricula().equals(matri)) {
                System.out.println(altAluno);
                encontrado = true;
            }
        }
        if (!encontrado) {
        	System.out.println("Nao foi possivel localizar um aluno com este numero de matricula");
        }
    }
}
