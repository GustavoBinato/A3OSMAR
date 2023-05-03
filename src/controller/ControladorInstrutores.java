/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Instrutor;

public class ControladorInstrutores {
    private List<Instrutor> instrutores;

    public ControladorInstrutores() {
        this.instrutores = new ArrayList<>();
    }

    public void adicionarInstrutor(Instrutor instrutor) {
        instrutores.add(instrutor);
    }

    public void removerInstrutor(Instrutor instrutor) {
        instrutores.remove(instrutor);
    }

    public List<Instrutor> listarInstrutores() {
        return instrutores;
    }

    public Instrutor buscarInstrutorPorNome(String nome) {
        for (Instrutor instrutor : instrutores) {
            if (instrutor.getNome().equalsIgnoreCase(nome)) {
                return instrutor;
            }
        }
        return null;
    }
}
