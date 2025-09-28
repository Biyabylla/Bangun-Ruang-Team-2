/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruangteam2;

/**
 *
 * @author Nabila
 */
public class alasPersegiAhid {
    
    private double Sisi;
    private double Tinggi;
    
    public void setSisi(double Sisix){
        this.Sisi = Sisix;
    }
    public void setTinggi(double Tinggix){
        this.Tinggi = Tinggix;
    }
    public double getSisi(){
        return this.Sisi;
    }
    public double getTinggi(){
        return this.Tinggi;
    }
    public double setVolume(){
        return Sisi * Sisi * Tinggi;
    }
    public double setLuasPermukaan(){
        return (2 * (Sisi * Sisi)) + (4 * (Sisi * Tinggi));
    }
            
}

