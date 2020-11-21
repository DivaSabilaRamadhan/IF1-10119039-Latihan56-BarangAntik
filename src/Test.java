/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : program ini berisi untuk menampilkan nama dan umur barang antik
 */
public class Test {

    public static int umur = 234;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio(umur);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik adalah : " + radio.getName());
        radio.tampilUmur();
    }
    
}
