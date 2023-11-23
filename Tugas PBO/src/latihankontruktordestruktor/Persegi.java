package latihankontruktordestruktor;

public class Persegi {
	private double sisi;

    // Konstruktor
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Metode untuk mendapatkan sisi
    public double getSisi() {
        return sisi;
    }

    // Metode untuk mengatur sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Metode untuk menghitung keliling persegi
    public double hitungKeliling() {
        return 4 * sisi;
    }

    // Metode untuk menghitung luas persegi
    public double hitungLuas() {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Persegi persegi = new Persegi(5.0); // Membuat objek Persegi dengan sisi 5.0

        System.out.println("Sisi Persegi: " + persegi.getSisi());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        System.out.println("Luas Persegi: " + persegi.hitungLuas());

        // Mengubah nilai sisi
        persegi.setSisi(7.0);
        System.out.println("Sisi Persegi (setelah diubah): " + persegi.getSisi());
        System.out.println("Keliling Persegi (setelah diubah): " + persegi.hitungKeliling());
        System.out.println("Luas Persegi (setelah diubah): " + persegi.hitungLuas());
    }
}


