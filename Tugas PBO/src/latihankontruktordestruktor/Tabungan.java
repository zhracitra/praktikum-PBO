package latihankontruktordestruktor;
import java.util.Scanner;

public class Tabungan {
    private int saldo;  

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            return jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi.");
            return 0;
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("====Program Penarikan Uang====");
			
			System.out.print("Masukan Saldo Awal : ");
			int saldoAwal = input.nextInt();

			Tabungan tabungan = new Tabungan(saldoAwal);

			System.out.print("Jumlah uang yang ingin diambil : ");
			int jumlahDiambil = input.nextInt();
			tabungan.ambilUang(jumlahDiambil);

			System.out.println("Saldo Anda Sekarang : " + tabungan.saldo);
		}
    }
}

