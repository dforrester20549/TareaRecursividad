/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recursividad recu = new Recursividad();
        
        char[] consonantes ={'b','c','d','f','g','h','j','k','l','m','n','ñ','p',
        +'q','r','s','t','v','w','x','y','z'};
        
        String cons="";
        
        int n_cons=0;
        
        String entrada= "Bienvenido al curso";
        
        recu.recorrerEntrada(entrada, consonantes, n_cons, cons);
        
        
        
        
    }
    
}
