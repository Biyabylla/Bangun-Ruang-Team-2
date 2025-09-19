/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangunruangteam2;

/**
 *
 * @author Nabila
 */
public class BangunRuangTeam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             // Buat objek Tabung
        tabungAngga tabung = new tabungAngga();

        // Kasih nilai jari-jari dan tinggi
        tabung.setJariJari(7);  // contoh jari-jari = 7
        tabung.setTinggi(10);   // contoh tinggi = 10

        // Tampilkan hasil
        System.out.println("Volume Tabung \t\t= " + tabung.getVolume());
        System.out.println("Luas Permukaan Tabung \t= " + tabung.getLuasPermukaan());
    } 
}
