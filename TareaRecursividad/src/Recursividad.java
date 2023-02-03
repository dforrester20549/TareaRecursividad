/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class Recursividad {
    
    public void recorrerEntrada(String entrada, char[]consonantes, int n_cons
    , String cons){
        for(int i=0; i>entrada.length(); i++){
            for(int a=0; a<consonantes.length; a++){
                if(entrada.charAt(i)==consonantes[a]){
                n_cons++;
                cons+=entrada.charAt(i);
                }
            }
        }
        System.out.println("Cadena Oringinal "+entrada);
        System.out.println("Consonantes ("+n_cons+") "+cons);      
    }
    
}
