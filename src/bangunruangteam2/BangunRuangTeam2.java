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
        System.out.println("========================= Bangun Ruang Team 2 =========================\n");
        System.out.println("-------- Kerucut --------");
        System.out.println("Rumus Volume (V) = 1/3 * Math.PI * r * r * t");
        System.out.println("Rumus Luas Permukaan (L) = Math.PI * r * r + Math.PI *r * s");
        System.out.println("Diketahui : Jari-jari = 7, Tinggi = 10");
        System.out.println("Ditanya : V, L");
        kerucutIlham k2 = new kerucutIlham();

        k2.setjarijari(7);
        k2.settinggi(10);

        System.out.println("volume kerucut=" + k2.getvolume());
        System.out.println("luas permukaan kerucut=" + k2.getluaspermukaan());

        System.out.println("-------- Kubus --------");
        System.out.println("Rumus Volume (V) = S * S * S");
        System.out.println("Rumus Luas Permukaan (L) = 6 * sisi * sisi");
        System.out.println("Diketahui : S = 14");
        System.out.println("Ditanya : V, L?");
        kubusAni ka = new kubusAni();

        ka.setsisi(14);
        System.out.println("V  = " + ka.setVolume());
        System.out.println("L  = " + ka.setLuasPermukaan());

        System.out.println("-------- Alas Persegi --------");
        System.out.println("Rumus Volume (V) = S * S * t");
        System.out.println("Rumus Luas Permukaan (L) = 2 x (S * S * t)");
        System.out.println("Diketahui : S = 8, t = 12");
        System.out.println("Ditanya : V, L?");
        alasPersegiAhid B2 = new alasPersegiAhid();

        B2.setSisi(8);
        B2.setTinggi(12);

        System.out.println("Volume balok alas persegi : " + B2.getVolume());
        System.out.println("Luas permukaan balok alas persegi : " + B2.getLuasPermukaan());

        // Buat objek Tabung
        System.out.println("-------- Tabung --------");
        System.out.println("Rumus Volume (V) =  3.14 * r * r * t");
        System.out.println("Rumus Luas Permukaan (L) = 2 * 3.14 * r (t + r)");
        System.out.println("Diketahui : Jari - jari = 7, t = 10");
        System.out.println("Ditanya : V, L?");
        tabungAngga tabung = new tabungAngga();

        // Kasih nilai jari-jari dan tinggi
        tabung.setJariJari(7);  // contoh jari-jari = 7
        tabung.setTinggi(10);   // contoh tinggi = 10

        // Tampilkan hasil
        System.out.println("Volume Tabung \t\t= " + tabung.getVolume());
        System.out.println("Luas Permukaan Tabung \t= " + tabung.getLuasPermukaan());

        System.out.println("-------- Balok --------");
        System.out.println("Rumus Volume (V) =  p * l * t");
        System.out.println("Rumus Luas Permukaan (L) = 2 * (p * l + P * t + l * t)");
        System.out.println("Diketahui : p = 100, l = 200, t = 300");
        System.out.println("Ditanya : V, L?");
        balokNabilaa bn = new balokNabilaa();

        bn.setPanjang(100);
        bn.setLebar(200);
        bn.setTinggi(300);

        System.out.println("Volume Balok \t= " + bn.setVolume());
        System.out.println("Luas Permukaan Balok \t= " + bn.setLuasPermukaan());

        System.out.println("-------- Bola --------");
        System.out.println("Rumus Volume (V) = 4/3 * π * r³");
        System.out.println("Rumus Luas Permukaan (L) = 4 * π * r²");
        System.out.println("Diketahui : Jari-jari = 10");
        System.out.println("Ditanya : V, L?");
        bolaAzik bola = new bolaAzik();

        bola.setJariJari(10);

        System.out.println("Volume Bola \t\t= " + bola.setVolume());
        System.out.println("Luas Permukaan Bola \t= " + bola.setLuasPermukaan());

        System.out.println("\n========================= Selesai =========================");

    }
}
