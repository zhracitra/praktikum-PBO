package latihankontruktordestruktor;
import java.util.Scanner;
/* Nama Anggota : 1. Azzahra Citra Insania (221106043007)
 * 				  2. Muhammad Kemal Abidin (221106042911)
 * 				  3. Muhammad Nabil Daffa  (221106042997)
 * 
 *   Kelas 		: Reguler D
 *   Tugas 		: Latihan Konstruktor destruktor
 *   				45. CETAK NAMA
 * 
 */
public class Printer {
	private String nama;
    private int jmlCetak;

    public Printer(String nama) {
        this.nama = nama;
        this.jmlCetak = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void cetak() {
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i+". " + nama);
        }
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public int getJmlCetak() {
        return jmlCetak;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======Aplikasi Pencetak Nama======");
        System.out.print("Masukkan nama anda : ");
        String nama = input.nextLine();
        Printer printer = new Printer(nama);

        System.out.print("Mau cetak nama berapa kali? : ");
        int jmlCetak = input.nextInt();
        printer.setJmlCetak(jmlCetak);
        
        System.out.println("Nama anda : " + printer.getNama());
        System.out.println("Hasil Cetak : ");
        printer.cetak();

        input.close();
    }
}
