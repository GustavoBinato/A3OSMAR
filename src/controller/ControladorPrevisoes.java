/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.PrevisaoSurfe;

public class ControladorPrevisoes {
    private List<PrevisaoSurfe> previsoes;

    public ControladorPrevisoes() {
        this.previsoes = new ArrayList<>();
    }

    public void adicionarPrevisao(PrevisaoSurfe previsao) {
        previsoes.add(previsao);
    }

    public void removerPrevisao(PrevisaoSurfe previsao) {
        previsoes.remove(previsao);
    }

    public List<PrevisaoSurfe> listarPrevisoes() {
        return previsoes;
    }

    public PrevisaoSurfe buscarPrevisaoPorData(Date data) {
        for (PrevisaoSurfe previsao : previsoes) {
            if (previsao.getData().equals(data)) {
                return previsao;
            }
        }
        return null;
    }
}
