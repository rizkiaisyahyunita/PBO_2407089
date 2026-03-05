package latihan_pbo.Tugas1_PBO_2407089;
    
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Pilih Bangun Datar");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Jajar Genjang");
        System.out.println("3. Segitiga");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan panjang: ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lebar = input.nextDouble();
            System.out.println("Luas Persegi Panjang = " + (panjang * lebar));
        }

        else if (pilihan == 2) {
            System.out.print("Masukkan alas: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();
            System.out.println("Luas Jajar Genjang = " + (alas * tinggi));
        }

        else if (pilihan == 3) {
            System.out.print("Masukkan alas: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();
            System.out.println("Luas Segitiga = " + (0.5 * alas * tinggi));
        }

        else {
            System.out.println("Pilihan tidak tersedia");
        }
    }
}