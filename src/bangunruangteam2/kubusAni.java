/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruangteam2;

/**
 *
 * @author Nabila
 */
public class kubusAni extends bangunRuang{
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
    public double getVolume() {
        volume = sisi * sisi * sisi;
        return volume;
    }

    // rumus luas permukaan kubus
    public double getLuasPermukaan() {
        luas = 6 * sisi * sisi;
        return luas;
    }
    
    @Override
  public void tampilkan(){
        System.out.println("========KUBUS========");
        System.out.println("Sisi :" + sisi);
        System.out.println("Luas :" + luas);
        System.out.println("Volume :" + volume);
  }
    
}
