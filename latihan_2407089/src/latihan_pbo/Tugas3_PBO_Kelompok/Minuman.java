package latihan_pbo.Tugas3_PBO_Kelompok;

public class Minuman extends Menu {
    private String ukuran;
    private double hargaDasar;

    public Minuman(String nama, double harga) {
        super(nama, harga);
        this.hargaDasar = harga;
        this.ukuran = "-";
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;

        if (ukuran.equalsIgnoreCase("Small")) {
            setHarga(hargaDasar);
        } else if (ukuran.equalsIgnoreCase("Medium")) {
            setHarga(hargaDasar + 2000);
        } else if (ukuran.equalsIgnoreCase("Large")) {
            setHarga(hargaDasar + 4000);
        }
    }

    @Override
    public void detailMenu() {
        System.out.println("Minuman: " + getNama() +
                " | Ukuran: " + ukuran +
                " | Harga: " + getHarga());
    }
}