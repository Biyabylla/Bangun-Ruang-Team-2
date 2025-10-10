/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruangteam2;

/**
 *
 * @author Nabila
 */
public class bangunRuang {
    public static void main(String[] args) {
        kubusAni k = new kubusAni();
       k.setsisi(14);
       k.setLuasPermukaan();
       k.setVolume();
       k.tampilkan();
    }
    double luas, volume;

    public double getLuas() {
        return luas;
    }

    public double getVolume() {
        return volume;
    }
    public void tampilkan(){
        System.out.println("Luas : " + luas);
        System.out.println("Volume : " + volume);
    }
}

