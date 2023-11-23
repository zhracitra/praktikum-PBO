package latihankontruktordestruktor;
import java.util.Scanner;
/*
 * Nama Anggota : 1. Azzahra Citra Insania (221106043007)
 * 				  2. Muhammad Kemal Abidin (221106042911)
 * 				  3. Muhammad Nabil Daffa  (221106042997)
 * 
 *   Kelas 		: Reguler D
 *   Tugas 		: Latihan Konstruktor destruktor
 *   				47. NILAI MAHASISWA
 */
public class NilaiMahasiswa {
	private double quiz;
    private double uts;
    private double uas;

    public NilaiMahasiswa(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        return (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
    }

    public char tentukanIndeks(double nilaiAkhir) {
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            return 'A';
        } else if (nilaiAkhir >= 68 && nilaiAkhir < 80) {
            return 'B';
        } else if (nilaiAkhir >= 56 && nilaiAkhir < 68) {
            return 'C';
        } else if (nilaiAkhir >= 45 && nilaiAkhir < 56) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public void cetakSemuaOutput() {
        System.out.println("QUIZ         = " + quiz);
        System.out.println("UTS          = " + uts);
        System.out.println("UAS          = " + uas);
        double nilaiAkhir = hitungNilaiAkhir();
        char indeks = tentukanIndeks(nilaiAkhir);
        System.out.println("Nilai Akhir  = " + nilaiAkhir);
        System.out.println("");
        System.out.println("Index = " + indeks);

        String keterangan;
        switch (indeks) {
            case 'A':
                keterangan = "Sangat Baik";
                break;
            case 'B':
                keterangan = "Baik";
                break;
            case 'C':
                keterangan = "Cukup";
                break;
            case 'D':
                keterangan = "Kurang";
                break;
            case 'E':
                keterangan = "Sangat Kurang";
                break;
            default:
                keterangan = "Tidak valid";
        }
        System.out.println("Keterangan = " + keterangan);
    }

    public static void main(String[] args) {
        NilaiMahasiswa mahasiswa1 = new NilaiMahasiswa(75.0, 45.0, 34.0);
        NilaiMahasiswa mahasiswa2 = new NilaiMahasiswa(60.0, 80.0, 75.0);
        NilaiMahasiswa mahasiswa3 = new NilaiMahasiswa(30.0, 80.0, 40.0);

        mahasiswa1.cetakSemuaOutput();

        System.out.println("");
        System.out.println("\n");
        mahasiswa2.cetakSemuaOutput();

        System.out.println("");
        System.out.println("\n");
        mahasiswa3.cetakSemuaOutput();
    }
}

	
	  