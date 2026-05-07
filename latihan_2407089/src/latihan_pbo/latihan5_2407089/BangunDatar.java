package latihan_pbo.latihan5_2407089;

public abstract class BangunDatar {
    private String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    // abstract method
    abstract double hitungLuas();

    // abstract method untuk keliling
    abstract double hitungKeliling();

    public void display() {
        System.out.println("Ini adalah: " + nama);
    }
}