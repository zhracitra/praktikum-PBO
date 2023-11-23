package latihankontruktordestruktor;

public class Baterai {
	private float kuatArus;
    private float hambatan;

    public Baterai() {
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan() {
        return kuatArus * hambatan;
    }

    public static void main(String[] args) {
        Baterai baterai = new Baterai(3.0f, 12.0f);

        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"
        		+ "\nakan berbanding lurus dengan beda potensial\npada ujung-ujung kawat penghantar tersebut"
        		+ "\nasalkan suhu kawat dijaga konstan.");
        System.out.println("\nKuat Arus: " + baterai.getKuatArus() + " ampere");
        System.out.println("Hambatan: " + baterai.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan: " + baterai.hitungTegangan() + " volt");
    }
}
