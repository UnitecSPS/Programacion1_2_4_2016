/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Multa {
    private String tipo;
    
    public Multa(String t){
        tipo = t;
    }
    
    public void setTipo(String t){
        tipo = t;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public int pago(){
        if(tipo.equals("Leve"))
            return 200;
        else if(tipo.equals("Medio"))
            return 500;
        else
            return 1000;
    }
    
    public void print(){
        System.out.println(tipo+"-"+pago());
    }
}
