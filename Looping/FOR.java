/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Looping;

/**
 *
 * @author Axioo Class Program
 */
public class FOR {
    public static void main(String[] args){
        int isigelas = 0;
        int penuh = 225;

        System.out.println("Isi gelas sekarang : " + isigelas + "ml");
        System.out.println("Isi gelas ketika Penuh : " + penuh + "ml");
        for(isigelas = 0 ; isigelas <= penuh ; isigelas++){
             System.out.println("Sedang mengisi gelas..");
             System.out.println("Isi gelas sekarang : " + isigelas+ "ml");  
         }
         System.out.println("Finale : Isi gelas sekarang : " + isigelas + "ml");
    }  
}
