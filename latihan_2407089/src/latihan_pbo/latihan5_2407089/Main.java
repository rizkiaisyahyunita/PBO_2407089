package latihan_pbo.latihan5_2407089;

public class Main {
    public static void main(String[] args) {

        BangunDatar b1 = new Persegi("Persegi", 4);
        b1.display();
        System.out.println("Luas: " + b1.hitungLuas());
        System.out.println("Keliling: " + b1.hitungKeliling());

        System.out.println();

        BangunDatar b2 = new Segitiga("Segitiga", 6, 8, 10);
        b2.display();
        System.out.println("Luas: " + b2.hitungLuas());
        System.out.println("Keliling: " + b2.hitungKeliling());
    }
}