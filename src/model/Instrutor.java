/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Instrutor {

    private String nome;
    private String contato;
    private List<String> especialidades;
    private HashMap<Date, List<Horario>> disponibilidade;

    public Instrutor(String nome, String contato, List<String> especialidades) {
        this.nome = nome;
        this.contato = contato;
        this.especialidades = especialidades;
        this.disponibilidade = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public HashMap<Date, List<Horario>> getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(HashMap<Date, List<Horario>> disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
