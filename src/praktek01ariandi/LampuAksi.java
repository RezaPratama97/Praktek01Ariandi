/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01ariandi;

/**
 *
 * @author ACER-PC
 */
public class LampuAksi {
    public static void main(String[] args) {
        Lampu Arinadi = new Lampu();
        
        Arinadi.merk="Vilips";
        Arinadi.harga="25000";
        Arinadi.warna="Putih";
        Arinadi.jenis="Spiral";
        
        Arinadi.cetakInfo();
    }
}
