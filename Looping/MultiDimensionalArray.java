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
public class MultiDimensionalArray {
    public static void main(String[] args){
        String matakuliah[];
        
        matakuliah = new String[10];
        
        matakuliah[0] = "Pemrograman Berbasis Objek 1";
        matakuliah[1] = "Visual 2";
        matakuliah[2] = "Rekayasa Perangkat Lunak";
        matakuliah[3] = "Organisasi Komputer";
        matakuliah[4] = "Pemrograman web 2";
        
        double[][] nilaimahasiswa = new double[5][30];
        nilaimahasiswa[0][0] = 80;
        nilaimahasiswa[1][0] = 90;
        nilaimahasiswa[2][0] = 75;
        nilaimahasiswa[3][0] = 70;
        
        double[] bobot = new double[4];
        bobot[0] = 4;
        bobot[1] = 4;
        bobot[2] = 3.5;
        bobot[3] = 3;
        
       nilaimahasiswa[4][0] = nilaimahasiswa[0][0] * bobot [0] +
        nilaimahasiswa[1][0] * bobot [1] +
        nilaimahasiswa[2][0] * bobot [2] +
        nilaimahasiswa[3][0] * bobot [3];
        System.out.println("Nilai si mahasiswa 1 : "+ nilaimahasiswa[4][0]);
        nilaimahasiswa[0][0] = 80;
        nilaimahasiswa[1][0] = 90;
        nilaimahasiswa[2][0] = 75;
        nilaimahasiswa[3][0] = 70;
        nilaimahasiswa[4][0] = 0;
        for (int i = 0; i <= 3; i++){
            nilaimahasiswa[4][1] += nilaimahasiswa[i][1] * bobot[i];  
        }
        System.out.println("Nilai si Mahasiswa 2 : "+ nilaimahasiswa[4][1]);
        double jumlahnilaiakhir = 0;
        for(int i = 0; i <= 3; i++){
            jumlahnilaiakhir += nilaimahasiswa[4][i];
        }
        System.out.println(jumlahnilaiakhir);
    }  
}
