/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan54.Koordinat;

/**
 *
 * @author
 * Nama  : Abraham Rumayara
 * KELAS : IF10K
 * NIM   : 10119905
 * Deskripsi Program : Program Koordinat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat objKoordinat = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+ objKoordinat.getNamaWarna());
        System.out.println("Sumbu x : "+ objKoordinat.getX()+", y : "+ objKoordinat.getY());
    }
    
}
