package latihankontruktordestruktor;

public class Tester {
	public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5.0);
        System.out.println("Persegi");
        System.out.println("Sisi Persegi: " + persegi.getSisi());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        System.out.println("Luas Persegi: " + persegi.hitungLuas());

        // Mengubah nilai sisi Persegi
        persegi.setSisi(7.0);
        System.out.println("Sisi Persegi (setelah diubah): " + persegi.getSisi());
        System.out.println("Keliling Persegi (setelah diubah): " + persegi.hitungKeliling());
        System.out.println("Luas Persegi (setelah diubah): " + persegi.hitungLuas());

        System.out.println(); // Pemisah

        // Membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(5.0, 3.0);
        System.out.println("Persegi Panjang");
        System.out.println("Panjang Persegi Panjang: " + persegiPanjang.getPanjang());
        System.out.println("Lebar Persegi Panjang: " + persegiPanjang.getLebar());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());

        // Mengubah nilai panjang dan lebar PersegiPanjang
        persegiPanjang.setPanjang(7.0);
        persegiPanjang.setLebar(4.0);
        System.out.println("Panjang Persegi Panjang (setelah diubah): " + persegiPanjang.getPanjang());
        System.out.println("Lebar Persegi Panjang (setelah diubah): " + persegiPanjang.getLebar());
        System.out.println("Keliling Persegi Panjang (setelah diubah): " + persegiPanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang (setelah diubah): " + persegiPanjang.hitungLuas());
    }
}


