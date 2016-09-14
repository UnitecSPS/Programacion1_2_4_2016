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
        int pos = buscar(num);
        if(pos >= 0){
            emps[pos].print();
            System.out.println("Total: "+emps[pos].pago());
        }
    }
    
    /**
     * Imprime los datos de TODOS mis empleados
     */
    public void print(){
        for(Empleado em : emps){
            if(em!=null)
                em.print();
        }
    }
    
    /**
     * Despide un empleado si existe dentro del arreglo
     * @param num Numero del Empleado
     * @return true si lo pudo despedir o false si no
     */
    public boolean despedir(int num){
        int pos = buscar(num);
        if(pos >= 0){
            emps[pos] = null;
            return true;
        }
        return false;
    }
    
    /**
     * Actualiza el salario de un empleado siempre y cuando
     * el nuevo salario sea mayor que el actual.
     * El empleado debe existir
     * @param num Numero del empleado
     * @param newsal Nuevo salario
     */
    public void actualizarSalarioDe(int num, double newsal){
        
    }
}
