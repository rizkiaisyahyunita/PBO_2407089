package latihan_pbo.Tugas3_PBO_Kelompok;

public class Makanan extends Menu {
    private String jenis;

    public Makanan(String nama, double harga) {
        super(nama, harga);
        this.jenis = "-";
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public void detailMenu() {
        System.out.println("Makanan: " + getNama() +
                " | Jenis: " + jenis +
                " | Harga: " + getHarga());
    }
}