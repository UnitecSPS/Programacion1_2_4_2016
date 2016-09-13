/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class TestEstadistica {
    public static void main(String[] args) {
        
        Estadistica stats = new Estadistica(6);
        stats.llenar();
        stats.list();
        System.out.println("Suma: "+stats.suma());
        System.out.println("Max: "+stats.max()+" Min: "+stats.min());
        double ds = stats.devStd();
        System.out.printf("Dev Std: %.2f\n",ds);
    }
}
