/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.LocalSurfe;

public class ControladorLocais {
    private List<LocalSurfe> locais;

    public ControladorLocais() {
        this.locais = new ArrayList<>();
    }

    public void adicionarLocal(LocalSurfe local) {
        locais.add(local);
    }

    public void removerLocal(LocalSurfe local) {
        locais.remove(local);
    }

    public List<LocalSurfe> listarLocais() {
        return locais;
    }

    public LocalSurfe buscarLocalPorNome(String nome) {
        for (LocalSurfe local : locais) {
            if (local.getNome().equalsIgnoreCase(nome)) {
                return local;
            }
        }
        return null;
    }
}
