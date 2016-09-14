/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Transito {
    public static void main(String[] args) {
        Multa m = new Multa("Leve");
        m.setTipo("Grave");
        System.out.println("Pagar: "+ m.pago());
        m.print();
    }
}
