package praktikum4;
import java.util.Scanner;

public class TestTabungan {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int saldo, tariktunai;
		
		System.out.print("Masukan Jumlah Saldo : ");
		saldo = input.nextInt();
		Tabungan tabungan = new Tabungan(saldo);
		System.out.println("Saldo awal : "+tabungan.saldo);

		System.out.print("Masukan Saldo Penarikan : ");
		tariktunai = input.nextInt();
		tabungan.ambilUang(tariktunai);
		System.out.println("jumlah uang yang diambil : "+tariktunai);
		System.out.println("Saldo Sekarang : "+tabungan.saldo);
	}
}
