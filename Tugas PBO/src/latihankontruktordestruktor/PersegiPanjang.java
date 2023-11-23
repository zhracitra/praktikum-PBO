package latihankontruktordestruktor;

public class PersegiPanjang {
	private double panjang;
    private double lebar;

    // Konstruktor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Metode untuk mendapatkan panjang
    public double getPanjang() {
        return panjang;
    }

    // Metode untuk mengatur panjang
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Metode untuk mendapatkan lebar
    public double getLebar() {
        return lebar;
    }

    // Metode untuk mengatur lebar
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Metode untuk menghitung keliling persegi panjang
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Metode untuk menghitung luas persegi panjang
    public double hitungLuas() {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(5.0, 3.0); // Membuat objek PersegiPanjang

        System.out.println("Panjang Persegi Panjang: " + persegiPanjang.getPanjang());
        System.out.println("Lebar Persegi Panjang: " + persegiPanjang.getLebar());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());

        // Mengubah nilai panjang dan lebar
        persegiPanjang.setPanjang(7.0);
        persegiPanjang.setLebar(4.0);
        System.out.println("Panjang Persegi Panjang (setelah diubah): " + persegiPanjang.getPanjang());
        System.out.println("Lebar Persegi Panjang (setelah diubah): " + persegiPanjang.getLebar());
        System.out.println("Keliling Persegi Panjang (setelah diubah): " + persegiPanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang (setelah diubah): " + persegiPanjang.hitungLuas());
    }
}


