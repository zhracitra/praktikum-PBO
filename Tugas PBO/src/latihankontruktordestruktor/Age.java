package latihankontruktordestruktor;

import java.util.Scanner;
public class Age {
	private int yearBirth;
    private int yearNow;
    private String red;

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur() {
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur) {
        if (umur < 5) {
            red = "LAGI LUCU-LUCUNYA";
        } else if (umur < 10) {
            red = "MASIH ANAK-ANAK";
        } else if (umur < 13) {
            red = "MASIH REMAJA";
        } else if (umur < 19) {
            red = "ALAY";
        } else if (umur < 29) {
            red = "LAGI SIBUK NYARI JODOH";
        } else if (umur < 35) {
            red = "LAGI SIBUK NYARI UANG";
        } else if (umur < 150) {
            red = "SUDAH TUA";
        } else {
            red = "TIDAK TERDETEKSI KEHIDUPAN";
        }

        return red;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Masukkan Tahun Lahir Anda: ");

			Age age = new Age(2018);  

			int tahunLahir = input.nextInt();
			age.setYearBirth(tahunLahir);

			int umur = age.hitungUmur();

			System.out.println("\n======Hasil Perhitungan Umur======");
			System.out.println("Tahun lahir Anda: " + age.getYearBirth());
			System.out.println("Hari ini tahun: " + age.getYearNow());
			System.out.println("Umur Anda sampai saat ini adalah " + umur + " tahun");
			System.out.println("Tandanya Kamu " + age.tandanyaKamu(umur));
		}
        
    }
}

