/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Marciano {
    private String nombre;
    private static int CONTADOR;
    
    static{
        CONTADOR = 0;
        System.out.println("Inicializando batallon....");
    }
    
    
    public static int getContador(){
        return CONTADOR;
    }

    public Marciano(String nombre) {
        this.nombre = nombre;
        CONTADOR++;
    }
    
    public void atacar(){
        if(CONTADOR >= 5)
            System.out.println("Yo "+nombre+" ATACO!!");
        else
            System.out.println("Yo "+nombre+" soy cobarde, solo hay "+
                    CONTADOR+" marcianos en el peloton");
    }
    
}
