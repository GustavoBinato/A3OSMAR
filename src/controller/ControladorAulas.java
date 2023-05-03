/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.AulaSurfe;
import model.Cliente;

public class ControladorAulas {
    private List<AulaSurfe> aulasAgendadas;

    public ControladorAulas() {
        this.aulasAgendadas = new ArrayList<>();
    }

    public void agendarAula(AulaSurfe aula) {
        aulasAgendadas.add(aula);
    }

    public void cancelarAula(AulaSurfe aula) {
        aulasAgendadas.remove(aula);
    }

    public List<AulaSurfe> listarAulas() {
        return aulasAgendadas;
    }

    public List<AulaSurfe> buscarAulaPorCliente(Cliente cliente) {
        List<AulaSurfe> aulasDoCliente = new ArrayList<>();
        for (AulaSurfe aula : aulasAgendadas) {
            if (aula.getCliente().equals(cliente)) {
                aulasDoCliente.add(aula);
            }
        }
        return aulasDoCliente;
    }
}
