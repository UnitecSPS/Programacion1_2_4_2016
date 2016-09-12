/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Empleado {
    //1-Atributos
    private int numero=3;
    private String nombre;
    private double salario;
    
    //2- Constructores
    public Empleado(int num, String nombre, double sal){
        System.out.println("Llame el constructor (int,String)");
        this.nombre = nombre;
        salario = sal;
        numero = num;
    }
    
    public Empleado(int numero){
        this(numero,"Unnamed",0);
        System.out.println("Llame el constructor (int)");
    }
    //3- Funciones
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void print(){
        System.out.println(numero+"-"+nombre+" Lps."+salario);
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getSalario(){
        if(salario > 0)
            return salario;
        System.out.println("Es que es negativo");
        return 0;
    }
    
    public double pago(){
        return salario - (salario*0.035);
    }
}
