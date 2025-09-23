/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruangteam2;

/**
 *
 * @author Nabila
 */
public class kubusAni {
    private double sisi;

    // setter
    public void setsisi(double sisi) {
        this.sisi = sisi;
    }

    // getter
    public double getsisi() {
        return this.sisi;
    }

    // rumus volume kubus
    public double setVolume() {
        return sisi * sisi * sisi;
    }

    // rumus luas permukaan kubus
    public double setLuasPermukaan() {
        return 6 * sisi * sisi;
    }
    
}
