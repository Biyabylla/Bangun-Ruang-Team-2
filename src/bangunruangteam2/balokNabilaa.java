/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruangteam2;

/**
 *
 * @author Nabila
 */
public class balokNabilaa extends bangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public balokNabilaa(){
    super();
    }
    
    public balokNabilaa(double panjang, double lebar, double tinggi){
    super();
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
    }
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
    @Override
    public void tampilkan(){
    super.tampilkan();
        System.out.println("-------- Balok --------");
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("tinggi = " + tinggi);
        System.out.println("Luas = " + luas);
        System.out.println("Volume = " + volume);
    }
}
