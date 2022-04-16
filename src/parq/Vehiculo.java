/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parq;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Moreno
 */
public class Vehiculo {

    String placa;
    String propietario;
    int tipo; //1. bicicleta / 2. moto / 3. automovil .... 
    int dE, mE, aE;
    int hE, minE;
    int dS, mS, aS;
    int hS, minS;
    int totMin;
    long totValor;
    final int VALOR1 = 10;
    final int VALOR2 = 50;
    final int VALOR3 = 100;
    
    public Vehiculo() {

    }

    public Vehiculo(String placa, String propietario, int tipo) {
        this.placa = placa;
        this.propietario = propietario;
        this.tipo = tipo;
    }

    public void registrarEntrada(int aE, int mE, int dE, int hE, int MinE) {
        this.aE = aE;
        this.mE = mE;
        this.dE = dE;
        this.hE = hE;
        this.minE = MinE;
    }

    public void registrarSalida(int aS, int mS, int dS, int hS, int MinS) {
        this.aS = aS;
        this.mS = mS;
        this.dS = dS;
        this.hS = hS;
        this.minS = MinS;
    }

    public void calcularTiempo() {
        int añosMinutos = (aS-aE)*525600;
        int mesMinutos = (mS-mE)*43800;
        int diaMinutos = (dS-dE)*1440;
        int horaMinutos = (hS-hE)*60;
        int minutos = minS-minE;
        this.totMin = añosMinutos + mesMinutos + diaMinutos + horaMinutos + minutos;
        

    }

    public void calcularValor() {
        if (tipo == 1) {
            totValor = totMin * VALOR1;
        }
        if (tipo == 2) {
            totValor = totMin * VALOR2;
        }
        if (tipo == 3) {
            totValor = totMin * VALOR3;
        }
    }
}
