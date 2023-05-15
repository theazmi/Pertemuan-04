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
public class TugasArray {
    public static void main(String[] args) {
        int [] nomor = {5, 9, 11, 3, 1};
        int max = nomor[0];
        
        for (int i=1; i < nomor.length; i++ ){
            if (nomor[i] > max) {
            max = nomor[i];
            }
        }
        System.out.println("Nilai Maksimum dalam Array : " + max);
}
}
