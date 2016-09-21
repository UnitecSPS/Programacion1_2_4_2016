/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa2;

/**
 *
 * @author Aula
 */
public class CuentaBancaria {
    private int codigo;
    private String nombre;
    private double saldo;
    
    public CuentaBancaria(int c, String n){
        codigo = c;
        nombre = n;
        saldo = 500;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double m){
        if(m > 0)
            saldo += m;
    }
    
    public boolean retirar(double m){
        if(m > 0 && m < saldo){
            saldo -= m;
            return true;
        }
        return false;
    }
    
    public void print(){
        System.out.println(codigo+nombre+saldo);
    }
}
