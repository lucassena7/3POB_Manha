package br.edu.faeterj;

import java.util.ArrayList;
import java.util.List;

public class QuartoMenu {
    private List<Quarto> quartos = new ArrayList<>();

    public void incluirQuarto(Quarto quarto) {
        // Validar dados
        if (quarto != null && quarto.getNomeQuarto() != null && !quarto.getNomeQuarto().isEmpty()) {
            quarto.setId(quartos.size() + 1);
            quartos.add(quarto);
            System.out.println("Quarto incluído com sucesso.");
        } else {
            System.out.println("Dados do quarto inválidos.");
        }
    }

    public void alterarQuarto(Quarto quarto) {
        // Implemente a lógica para alterar um quarto
        // Aqui você pode validar e alterar os dados do quarto na lista
    }

    public void excluirQuarto(int quartoId) {
        quartos.removeIf(quarto -> quarto.getId() == quartoId);
        System.out.println("Quarto excluído com sucesso.");
    }

    public List<Quarto> listarQuartos() {
        return quartos;
    }
}
