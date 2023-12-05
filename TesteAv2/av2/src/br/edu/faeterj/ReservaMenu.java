package br.edu.faeterj;

import java.util.ArrayList;
import java.util.List;

public class ReservaMenu {
    private List<Reserva> reservas = new ArrayList<>();

    public void incluirReserva(Reserva reserva) {
        // Validar dados
        if (reserva != null && reserva.getIdCliente() > 0 && reserva.getIdQuarto() > 0) {
            reserva.setId(reservas.size() + 1);
            reservas.add(reserva);
            System.out.println("Reserva incluída com sucesso.");
        } else {
            System.out.println("Dados da reserva inválidos.");
        }
    }

    public void alterarReserva(Reserva reserva) {
        // Implemente a lógica para alterar uma reserva
        // Aqui você pode validar e alterar os dados da reserva na lista
    }

    public void excluirReserva(int reservaId) {
        reservas.removeIf(reserva -> reserva.getId() == reservaId);
        System.out.println("Reserva excluída com sucesso.");
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }
}
