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
public class Banco {
    private CuentaBancaria cuentas[];
    public static double TASA = 0.01;
    
    public Banco(int max){
        cuentas = new CuentaBancaria[max];
    }
    
    public CuentaBancaria buscar(int cod){
        for(CuentaBancaria cuenta : cuentas){
            if(cuenta!=null && cuenta.getCodigo() == cod)
                return cuenta;
        }
        return null;
    }
    
    public boolean agregar(int cod, String n){
        if(buscar(cod) == null){
            for(int c=0; c < cuentas.length; c++){
                if(cuentas[c] == null){
                    cuentas[c] = new CuentaBancaria(cod, n);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public void transferir(int co, int cd, double m){
        CuentaBancaria cuentao = buscar(co);
        CuentaBancaria cuentad = buscar(cd);
        
        if(cuentao != null && cuentad != null){
            if(cuentao.retirar(m))
                cuentad.depositar(m);
        }
    }
    
    public void intereses(){
        for(CuentaBancaria cuenta : cuentas){
            if(cuenta != null)
                cuenta.depositar( cuenta.getSaldo() * TASA );
        }
    }
    
    public void list(double m){
        for(CuentaBancaria cuenta : cuentas){
            if(cuenta != null && cuenta.getSaldo() >= m)
                cuenta.print();
        }
    }
}
