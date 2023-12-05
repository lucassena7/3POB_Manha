package br.edu.faeterj;

import java.util.ArrayList;
import java.util.List;

public class CamaMenu {
    private List<Cama> camas = new ArrayList<>();

    public void incluirCama(Cama cama) {
        // Validar dados
        if (cama != null && cama.getCodigoCama() != null && !cama.getCodigoCama().isEmpty()) {
            cama.setId(camas.size() + 1);
            camas.add(cama);
            System.out.println("Cama incluída com sucesso.");
        } else {
            System.out.println("Dados da cama inválidos.");
        }
    }

    public void alterarCama(Cama cama) {
        // Implemente a lógica para alterar uma cama
        // Aqui você pode validar e alterar os dados da cama na lista
    }

    public void excluirCama(int camaId) {
        camas.removeIf(cama -> cama.getId() == camaId);
        System.out.println("Cama excluída com sucesso.");
    }

    public List<Cama> listarCamas() {
        return camas;
    }
}
