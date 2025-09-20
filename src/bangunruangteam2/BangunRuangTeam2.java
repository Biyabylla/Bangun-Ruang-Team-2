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
        kerucutIlham k2 = new kerucutIlham();

        k2.setjarijari(7);
        k2.settinggi(10);

        System.out.println("volume kerucut=" + k2.getvolume());
        System.out.println("luas permukaan kerucut=" + k2.getluaspermukaan());

        kubusAni ka = new kubusAni();

        ka.setsisi(14);
        System.out.println("volume kubus = " + ka.getVolume());
        System.out.println("luas permukaan kubus = " + ka.getLuasPermukaan());

        alasPersegiAhid B2 = new alasPersegiAhid();

        B2.setSisi(8);
        B2.setTinggi(12);

        System.out.println("Volume balok alas persegi : " + B2.getVolume());
        System.out.println("Luas permukaan balok alas persegi : " + B2.getLuasPermukaan());
        // Buat objek Tabung
        tabungAngga tabung = new tabungAngga();

        // Kasih nilai jari-jari dan tinggi
        tabung.setJariJari(7);  // contoh jari-jari = 7
        tabung.setTinggi(10);   // contoh tinggi = 10

        // Tampilkan hasil
        System.out.println("Volume Tabung \t\t= " + tabung.getVolume());
        System.out.println("Luas Permukaan Tabung \t= " + tabung.getLuasPermukaan());
        balokNabilaa bn = new balokNabilaa();

        bn.setPanjang(100);
        bn.setLebar(200);
        bn.setTinggi(300);

        System.out.println("Volume Balok \t= " + bn.getVolume());
        System.out.println("Luas Permukaan Balok \t= " + bn.getLuasPermukaan());

    }

}
