package latihankontruktordestruktor;

import java.util.Scanner;

public class EmasKawin {
	private double beratEmas;
    private double hargaPerGram;

    public EmasKawin(double beratEmas, double hargaPerGram) {
        this.beratEmas = beratEmas;
        this.hargaPerGram = hargaPerGram;
    }

    public double hitungTotalBayar() {
        return beratEmas * hargaPerGram;
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }

    public void setHargaPerGram(double hargaPerGram) {
        this.hargaPerGram = hargaPerGram;
    }

    public double getBeratEmas() {
        return beratEmas;
    }

    public double getHargaPerGram() {
        return hargaPerGram;
    }

    public void cetak(String nama) {
        System.out.println("Nama Pemilik Emas: " + nama);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pemilik emas: ");
        String namaPemilikEmas = input.nextLine();

        EmasKawin emasKawin = new EmasKawin(15.7, 570000);
        double totalBayar = emasKawin.hitungTotalBayar();

        emasKawin.cetak(namaPemilikEmas); // Menampilkan nama pemilik emas

        System.out.println("Total Bayar: Rp " + totalBayar);
        input.close();
    }
}


