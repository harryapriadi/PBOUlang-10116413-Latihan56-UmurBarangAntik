/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan56.umurbarangantik;

/**
 *
 * @author Lenovo
 * NAMA         : HARRY APRIADI
 * KELAS        : PBOULANG
 * NIM          : 10116413
 * DESKRIPSI    : Membuat Program Menentukan Umur Barang Antik
 */
public class PBOUlang10116413Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    static int umur;
    private static String name;

    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio(umur);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik : " + radio.getName());
        BarangAntik barang = new BarangAntik(umur);
        barang.tampilUmur();
    }

}
