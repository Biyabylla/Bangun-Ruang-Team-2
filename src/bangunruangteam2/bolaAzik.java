/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruangteam2;

/**
 *
 * @author user
 */
public class bolaAzik extends bangunRuang {
    private double jariJari;

    public bolaAzik() {
        super();
    }

    public bolaAzik(double jariJari) {
        super();
        this.jariJari = jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return this.jariJari;
    }

    public double setVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    public double setLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    public void tampilkan() {
        super.tampilkan();
        System.out.println("-------- Bola --------");
        System.out.println("Jari-jari = " + jariJari);
        System.out.println("Luas = " + luas);
        System.out.println("Volume = " + volume);
    }
}
