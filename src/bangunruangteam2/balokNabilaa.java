/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruangteam2;

/**
 *
 * @author Nabila
 */
public class balokNabilaa {
    private double panjang;
    private double lebar;
    private double tinggi;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return this.panjang;
    }

    public double getLebar() {
        return this.lebar;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public double setVolume() {
        return panjang * lebar * tinggi;
    }

    public double setLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}
