/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Empresa {
    public static String nombre;
    
    public static void main(String[] args) {
        nombre = "UNITEC";
        
        Empleado em = new Empleado(1,"Andres",5000); 
        Empleado em2 = new Empleado(2);
        
        em2.setNombre("Esther");
        em2.setSalario(7000);
        
        em.print();
        em2.print();
        
        if(em.getNumero() == 1){
            System.out.println("SI ES IGUAL A 1!");
        }
        
        if(em2.getNombre().equalsIgnoreCase("ESTHER")){
            System.out.println("SI es Esther!");
        }
        
        System.out.println("Pago de Em: "+em.pago());
        
        if(em2 != null){
            System.out.println("NO es nulo!");
            em2 = null;
        }
        
        Empleado em3 = null; 
        em3.print();
    }
}
