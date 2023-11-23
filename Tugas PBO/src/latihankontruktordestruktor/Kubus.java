package latihankontruktordestruktor;
import java.util.Scanner; 
/*Nama Anggota : 1. Azzahra Citra Insania (221106043007)
 * 				  2. Muhammad Kemal Abidin (221106042911)
 * 				  3. Muhammad Nabil Daffa  (221106042997)
 * 
 *   Kelas 		: Reguler D
 *   Tugas 		: Latihan Konstruktor destruktor
 *   				41. MASSA JENIS
 * 
 */
public class Kubus {
    private int sisi;  
    private int massa;  
    
    public Kubus(int sisi, int massa) {
        this.sisi = sisi;
        this.massa = massa;
    }
    
    public int getSisi() {
        return sisi;
    }
   
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    public double getMassa() {
        return massa;
    }
    
    public void setMassa(double massa) {
        this.massa = (int) massa;
    }
   
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    public double hitungMassaJenis() {
        return massa / hitungVolume();
    }

    public static void main(String[] args) {
        Kubus kubus = new Kubus(5, 250);  

        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi : " + kubus.getSisi());
        System.out.println("Massa : " + kubus.getMassa());

        System.out.println("\n======Hasil Perhitungan======");
        System.out.println("Volume : " + (int)kubus.hitungVolume());
        System.out.println("Massa Jenis : " + (int)kubus.hitungMassaJenis());
    }
}

