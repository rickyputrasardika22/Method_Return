package Method_Return;
import java.util.Scanner;
public class Bangun_Datar 
{
	static Scanner ricky = new Scanner(System.in);
	
	//method dengan nilai balik yang bertipe double
	//mempunyai 2 parameter formal yaitu panjang dan lebar (bersifat lokal)
	public static double luas_persegi (double panjang, double lebar)
	{
		double luas;	//variabel output yang besifat lokal
		luas = panjang * lebar;
		return luas;
	}
	
	//method dengan nilai balik yang bertipe double
	//mempunyai 2 parameter formal yaitu panjang dan lebar (bersifat lokal)
	public static double keliling_persegi (double panjang, double lebar)
	{
		return 2*panjang + 2*lebar;
	}
	public static void persegi ()
	{
		double p, l;
		System.out.print("Masukkan Panjang = ");
		p = ricky.nextDouble();
		System.out.print("Masukkan Lebar = ");
		l = ricky.nextDouble();
		
		System.out.println("Luas Persegi = " + luas_persegi(p, l));
//		luas_persegi(p, l);
		System.out.println("Keliling Persegi = " + keliling_persegi(p, l));
//		keliling_persegi(p, l);
	}
	
	
	
	public static void main(String[] args) 
	{
		persegi();
	}
	
	
}
