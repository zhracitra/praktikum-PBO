package intro;

import java.util.Scanner;

public class perkalian {
	public static void perkalian (){
	//TODO Auto-generated 
		int angka1, angka2, hasil;
		Scanner Input = new Scanner(System.in);
		
		System.out.print("--- Perkalian ---\n");
		System.out.print("Masukan Angka 1 =");
		angka1 = Input.nextInt();
		System.out.print("Masukan Angka 2 =");
		angka2 = Input.nextInt();
		
		hasil = angka1 * angka2;
		System.out.println("Hasil Perkalian = "+hasil);
	}
		
	
		public static void pembagian (){
		//TODO Auto-generated 
			int angka1, angka2, hasil;
			Scanner Input = new Scanner(System.in);
			
			System.out.print("--- Pembagian ---\n");
			System.out.print("Masukan Angka 1 =");
			angka1 = Input.nextInt();
			System.out.print("Masukan Angka 2 =");
			angka2 = Input.nextInt();
			
			hasil = angka1 / angka2;
			System.out.println("Hasil Pembagian = "+hasil);		
		}

		
			public static void pengurangan (){
			//TODO Auto-generated 
				int angka1, angka2, hasil;
				Scanner Input = new Scanner(System.in);
				
				System.out.print("--- Pengurangan ---\n");
				System.out.print("Masukan Angka 1 =");
				angka1 = Input.nextInt();
				System.out.print("Masukan Angka 2 =");
				angka2 = Input.nextInt();
				
				hasil = angka1 - angka2;
				System.out.println("Hasil Pengurangan = "+hasil);
			}
			
	
				public static void penambahan (){
				//TODO Auto-generated 
					int angka1, angka2, hasil;
					Scanner Input = new Scanner(System.in);
					
					System.out.print("--- Penambahan ---\n");
					System.out.print("Masukan Angka 1 =");
					angka1 = Input.nextInt();
					System.out.print("Masukan Angka 2 =");
					angka2 = Input.nextInt();
					
					hasil = angka1 + angka2;
					System.out.println("Hasil Penambahan = "+hasil);
					
				}
}

			

					