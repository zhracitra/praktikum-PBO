package latihankontruktordestruktor;

public class Baseball {
	private double massa;
    private double kecepatan;

    public Baseball(double massa, double kecepatan) {
        this.massa = massa;
        this.kecepatan = kecepatan;
    }

    public double getMassa() {
        return massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public double hitungEnergiKinetik() {
        // Menghitung energi kinetik
        return 0.5 * massa * kecepatan * kecepatan;
    }

    public double hitungUsahaAwal() {
        // Menghitung usaha yang diperlukan untuk mencapai kecepatan dari keadaan diam
        return 0.5 * massa * kecepatan * kecepatan;
    }

    public static void main(String[] args) {
        Baseball baseball = new Baseball(0.145, 25.0);

        // Menghitung energi kinetik
        double energiKinetik = baseball.hitungEnergiKinetik();
        System.out.println("Energi Kinetik : " + energiKinetik + " Joule");

        // Menghitung usaha untuk mencapai kecepatan ini dari keadaan diam
        double usahaAwal = baseball.hitungUsahaAwal();
        System.out.println("Usaha Awal : " + usahaAwal + " Joule");
    }
}


