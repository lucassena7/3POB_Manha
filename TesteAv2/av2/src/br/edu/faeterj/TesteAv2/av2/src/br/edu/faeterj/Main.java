package br.edu.faeterj;

public class Main {
    public static void main(String[] args) {
        ClienteMenu clienteManager = new ClienteMenu();
        QuartoMenu quartoManager = new QuartoMenu();
        CamaMenu camaManager = new CamaMenu();
        ReservaMenu reservaManager = new ReservaMenu();

        // Incluindo um cliente
        Cliente cliente1 = new Cliente(
                "Filipe Luis",
                "Rua Barao do Flamengo, 3",
                "12345-678",
                "Brasil",
                "123.456.789-10",
                "FLA3xLIB",
                "filipeluis@email.com",
                "09/08/1985"
        );
        
        Cliente cliente2 = new Cliente(
                "Rodrigo Caio",
                "Rua Barao do Flamengo, 8",
                "87654-321",
                "Brasil",
                "109.876.543-21",
                "FLA8xBRA",
                "rodrigocaio@email.com",
                "17/08/1993"
        );

        //Incluindo quartos
        Quarto quarto1 = new Quarto(
        		1,
                "Quarto RubroNegro",
                4,
                true,
                "Quarto espaçoso com vista para o mar, Proibido fumar"
        );
        
        Quarto quarto2 = new Quarto(
        		2,
                "Quarto TriLibertadores",
                8,
                false,
                "Quarto gigante com vista vista para o mar, Proibido fumar, aceita pet"
        );

        //Incluindo camas
        Cama cama1 = new Cama(
        		1,
                2,
                false,
                "Ao lado da janela, sol da manha",
                "Cama confortavel"
        );
        
        Cama cama2 = new Cama(
        		2,
                3,
                true,
                "Perto da porta",
                "Em cima, sol da tarde, Cama confortavel"
        );

        Cama cama3 = new Cama(
        		3,
                3,
                true,
                "Perto da porta",
                "Embaixo, sol da tarde, Cama confortavel"
        );
        
        //Incluindo reservas
        Reserva reserva1 = new Reserva(
        		1,
                3,  // ID do quarto
                "123.456.789-10",  // cpf do cliente
                "2023-12-01",
                "2023-12-05"
        );
       
        Reserva reserva2 = new Reserva(
        		2,
                3,  // ID do quarto
                "123.456.789-10",  // cpf do cliente
                "2023-12-01",
                "2023-12-05"
        );

        // Exemplo de como listar clientes
        List<Cliente> clientes = clienteManager.listarClientes();
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNome());
        }
    }
}
