/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Horario {
    private int horaInicio;
    private int minutoInicio;
    private int horaFim;
    private int minutoFim;

    public Horario(int horaInicio, int minutoInicio, int horaFim, int minutoFim) {
        this.horaInicio = horaInicio;
        this.minutoInicio = minutoInicio;
        this.horaFim = horaFim;
        this.minutoFim = minutoFim;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getMinutoInicio() {
        return minutoInicio;
    }

    public void setMinutoInicio(int minutoInicio) {
        this.minutoInicio = minutoInicio;
    }

    public int getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }

    public int getMinutoFim() {
        return minutoFim;
    }

    public void setMinutoFim(int minutoFim) {
        this.minutoFim = minutoFim;
    }
}
