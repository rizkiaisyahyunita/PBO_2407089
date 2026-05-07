package latihan_pbo.latihan5_2407089;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    double hitungKeliling() {
        return 4 * sisi;
    }
}