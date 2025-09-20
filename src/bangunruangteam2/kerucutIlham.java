/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruangteam2;

/**
 *
 * @author Nabila
 */
public class kerucutIlham {
    private double jarijari;
    private double tinggi;
    
    public void setjarijari(double jarijari){
        this.jarijari = jarijari;
    }
     public void settinggi(double tinggi){
         this.tinggi = tinggi;
     }
     public double getjarijari(){
         return this.jarijari;
     }
     public double gettinggi(){
         return this.tinggi;
     }
     public double getvolume(){
         return (1.0/3.0)*Math.PI*jarijari*jarijari*tinggi;            
     }
     
     public double getluaspermukaan(){
         double s = Math.sqrt((jarijari*jarijari)+(tinggi*tinggi)); // garis pelukis
         return Math.PI* jarijari * (jarijari+s);
     }
    
}
