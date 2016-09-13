
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Estadistica {
    //1-atributo: Un arreglo uni. de doubles
    private double numeros[];
    /*
    Constructor:
        Recibe de parametro un valor entero para inicializar el tamaño
        del arreglo de doubles
    */
    public Estadistica(int longi){
        numeros = new double[longi];
    }
    
    //funciones
    
    /**
     * LLENA todo el arreglo con valores del teclado
     */
    public void llenar(){
        Scanner lea = new Scanner(System.in);
        for(int n=0; n < numeros.length; n++){
            System.out.print("["+n+"]: ");
            numeros[n] = lea.nextDouble();
        }
    }
    
    /**
     * 
     * @return LA SUMA DE LOS VALORES EN EL ARREGLO
     */
    public double suma(){
        double suma = 0;
        for(double num : numeros){
            suma += num;
        }
        return suma;
    }
    
    /**
     * Retorna el valor MAYOR que esta en el arreglo
     * @return 
     */
    public double max(){
        double mayor=0;//Double.MIN_VALUE;
        for(int p=0; p < numeros.length; p++){
            if(p == 0 || numeros[p] > mayor)
                mayor = numeros[p];
        }
        return mayor;
    }
    
    /**
     * Retorna el valor MENOR que esta en el arreglo
     * @return 
     */
    public double min(){
       double min=0;//Double.MAX_VALUE;
        for(int p=0; p < numeros.length; p++){
            if(p == 0 || numeros[p] < min)
                min = numeros[p];
        }
        return min; 
    }
    
    /**
     * IMPRIMIR todos los elementos del arreglo
     */
    public void list(){
        for(double num : numeros)
            System.out.print("["+num+"]");
        System.out.println("");
    }

    /**
     * RETORNA el valor promedio del arreglo
     * @return 
     */
    public double promedio(){
        return suma()/numeros.length;
    }
    
    /**
     * Devuelve la desviacion standar del arreglo
     * NOTA: Utilizar la clase Math: 
     * https://es.wikipedia.org/wiki/Desviaci%C3%B3n_t%C3%ADpica
     * @return 
     */
    public double devStd(){
        double prom = promedio();
        
        double sum = 0;
        for(double num : numeros){
            sum += Math.pow(num-prom, 2);
        }
        double total = sum / (numeros.length-1);
        return Math.sqrt(total);
    }
}
