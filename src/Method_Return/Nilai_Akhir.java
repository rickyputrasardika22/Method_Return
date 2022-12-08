package Method_Return;

import java.util.Scanner;

public class Nilai_Akhir 
{
	static Scanner ricky = new Scanner(System.in);
	
	public static double Total_nilaiAkhir (double kuis, double tugas, double uts, double uas)
	{
		double Hitung_nilaiAkhir;
		Hitung_nilaiAkhir = (0.1*kuis) + (0.2*tugas) + (0.3*uts) + (0.4*uas);
		return Hitung_nilaiAkhir;
	}
	
	public static char Hitung_nilaiHuruf(double Hitung_nilaiAkhir)
	{
		char nilaiHuruf = 0;
		
		if (Hitung_nilaiAkhir >= 80)
		{
			nilaiHuruf = 'A';
		}
		else if (Hitung_nilaiAkhir >= 68 && Hitung_nilaiAkhir < 80)
		{
			nilaiHuruf = 'B';
		}
		else if (Hitung_nilaiAkhir >= 56 && Hitung_nilaiAkhir < 68)
		{
			nilaiHuruf = 'C';
		}
		else if (Hitung_nilaiAkhir >= 45 && Hitung_nilaiAkhir < 56)
		{
			nilaiHuruf = 'D';
		}
		else if (Hitung_nilaiAkhir < 45)
		{
			nilaiHuruf = 'E';
		}
		
		return nilaiHuruf;
	}
	
	public static String Prodi(String npm)
	{
		//2226250129p
		String prodi;
		
		prodi = (npm.substring(4, 6));
		if(prodi.equalsIgnoreCase("25"))
		{
			prodi = "Teknik Informatika";
		}
		else if(prodi.equalsIgnoreCase("24"))
		{
			prodi = "Sistem Informasi";
		}
		
		return prodi;
	}
	
	
	
	public static void input_data ()
	{
		String nama, npm, prodi;
		double kuis, tugas, uts, uas, nilaiAkhir;
		char nilaiHuruf;
		
		System.out.print("Masukkan Nama = ");
		nama = ricky.next();
		System.out.print("Masukkan NPM = ");
		npm = ricky.next();
		System.out.print("Masukkan Kuis = ");
		kuis = ricky.nextDouble();
		System.out.print("Masukkan Tugas = ");
		tugas = ricky.nextDouble();
		System.out.print("Masukkan UTS = ");
		uts = ricky.nextDouble();
		System.out.print("Masukkan UAS = ");
		uas = ricky.nextDouble();
		
		Total_nilaiAkhir(kuis, tugas, uts, uas);
		nilaiAkhir = Total_nilaiAkhir(kuis, tugas, uts, uas);
		
		Hitung_nilaiHuruf(nilaiAkhir);
		nilaiHuruf = Hitung_nilaiHuruf(nilaiAkhir);
		
		Prodi(npm);
		prodi = Prodi(npm);
		
		System.out.print("Nilai Akhir = " + nilaiAkhir);
		System.out.println();
		System.out.print("Nilai Huruf = " + nilaiHuruf);
		System.out.println();
		System.out.print("Program Studi = " + prodi);
		
		
	}
	
	public static void main(String[] args) 
	{
		input_data();
	}
}
