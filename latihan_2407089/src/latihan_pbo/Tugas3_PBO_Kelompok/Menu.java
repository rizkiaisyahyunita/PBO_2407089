package latihan_pbo.Tugas3_PBO_Kelompok;

public class Menu {
    private String nama;
    private double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setHarga(double harga, double diskon) {
        this.harga = harga - diskon;
    }

    public void detailMenu() {
        System.out.println(nama + " | Harga: " + harga);
    }
}