package latihan_pbo.Latihan4_2407089;

public class Menu {
    protected String nama;
    protected double harga;

    // constructor
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // method default (nanti dioverride)
    public double hitungTotal() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Nama Menu: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Total: " + hitungTotal());
    }
}