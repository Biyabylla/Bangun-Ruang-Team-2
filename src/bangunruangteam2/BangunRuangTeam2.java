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
        balokNabilaa bn = new balokNabilaa();

        bn.setPanjang(100);
        bn.setLebar(200);
        bn.setTinggi(300);

        System.out.println("Volume Balok \t= " + bn.getVolume());
        System.out.println("Luas Permukaan Balok \t= " + bn.getLuasPermukaan());
    }
}
