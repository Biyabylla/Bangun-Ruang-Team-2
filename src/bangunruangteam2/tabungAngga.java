/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruangteam2;

/**
 *
 * @author Nabila
 */
public class tabungAngga {
    // Atribut private
    private double jariJari;
    private double tinggi;

    // Setter
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Getter
    public double getJariJari() {
        return this.jariJari;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    // Hitung Volume Tabung
    public double setVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    // Hitung Luas Permukaan Tabung
    public double setLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
}
