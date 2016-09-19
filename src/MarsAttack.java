/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class MarsAttack {
    public static void main(String[] args) {
        Marciano mars[] = new Marciano[5];
        mars[0] = new Marciano("Melvin");
        mars[1] = new Marciano("Alf");
        mars[2] = new Marciano("ET");
        mars[3] = new Marciano("Messi");
        mars[4] = new Marciano("Jar Jar");
        
        System.out.println("Marcianos: "+Marciano.getContador());
        
        for(Marciano mar : mars){
            if(mar != null)
                mar.atacar();
        }
            
    }
}
