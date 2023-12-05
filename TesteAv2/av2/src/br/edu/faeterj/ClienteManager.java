package br.edu.faeterj;

import java.util.ArrayList;
import java.util.List;

public class ClienteManager {
    private List<Cliente> clientes = new ArrayList<>();

    public void incluirCliente(Cliente cliente) {
        // Validar dados
        if (cliente != null && cliente.getNome() != null && !cliente.getNome().isEmpty()) {
            cliente.setId(clientes.size() + 1);
            clientes.add(cliente);
            System.out.println("Cliente incluído com sucesso.");
        } else {
            System.out.println("Dados do cliente inválidos.");
        }
    }

    public void alterarCliente(Cliente cliente) {
        // Implemente a lógica para alterar um cliente
        // Aqui você pode validar e alterar os dados do cliente na lista
    }

    public void excluirCliente(int clienteId) {
        clientes.removeIf(cliente -> cliente.getId() == clienteId);
        System.out.println("Cliente excluído com sucesso.");
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }
}
