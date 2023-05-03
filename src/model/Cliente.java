/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Cliente {
    private String nome;
    private String email;
    private String nivelHabilidade;

    public Cliente(String nome, String email, String nivelHabilidade) {
        this.nome = nome;
        this.email = email;
        this.nivelHabilidade = nivelHabilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivelHabilidade() {
        return nivelHabilidade;
    }

    public void setNivelHabilidade(String nivelHabilidade) {
        this.nivelHabilidade = nivelHabilidade;
    }
}
