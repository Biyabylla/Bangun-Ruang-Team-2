/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruangteam2;

/**
 *
 * @author Nabila
 */
public class bangunRuangKubus {
     public static void main(String[] args) {
        // TODO code application logic here
        kubusAni cb = new kubusAni();
        
        cb.setsisi(14);
        System.out.println("volume kubus = "+cb.getVolume());
        System.out.println("luas permukaan kubus = "+cb.getLuasPermukaan());
    }
}
