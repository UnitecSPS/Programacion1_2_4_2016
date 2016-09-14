/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Company {
    //Atributo que sea arreglo de Empleado
    private Empleado emps[];
    /*
    Constructror recibe de parametro un valor entero
    para inicalizar el arreglo de empleados
    */
    public Company(int max){
        emps = new Empleado[max];
    }
    
    /**
     * Busca un empleado con ese numero
     * @param numero Numero de empleado a buscar
     * @return La posicion de ese empleado en el arreglo si lo
     *  encuentro. Sino, retorno -1
     */
    public int buscar(int numero){
        for(int p=0; p < emps.length; p++){
            Empleado e = emps[p];
            if(e != null && e.getNumero() == numero)
                return p;
        }
        return -1;
    }
    
    /**
     * Agrega un nuevo Empleado en una posicion disponible
     * del arreglo. Siempre y cuando el numero de empleado
     * no este repetido
     * @param num Numero de empleado
     * @param nom Nombre de empleado
     * @param sal salario de empleado
     * @return true si lo pude agregar o false si no.
     */
    public boolean contratar(int num, String nom, double sal){
        if(buscar(num) == -1){
            for(int p=0; p < emps.length; p++){
                if(emps[p] == null){
                    emps[p] = new Empleado(num, nom, sal);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * Imprime los datos del empleado y su pago mensual
     * SI el empleado existe
     * @param num Numero del empleado
     */
    public void pagarA(int num){
        
    }
}
