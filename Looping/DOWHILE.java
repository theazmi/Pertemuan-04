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
public class DOWHILE {
    public static void main(String[] args){
        int isigelas = 0;
        int penuh = 225;
        System.out.println("Isi gelas sekarang : " + isigelas + "ml");
        System.out.println("Isi gelas ketika Penuh : " + penuh + "ml");
        do{
           isigelas++;
           System.out.println("Sedang mengisi gelas..");
           System.out.println("Isi gelas sekarang : " + isigelas+ "ml");
         }while(isigelas != penuh);
         System.out.println("Finale : Isi gelas sekarang : " + isigelas + "ml");
    }  
}
