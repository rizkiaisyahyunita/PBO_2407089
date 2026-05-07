package latihan_pbo.latihan5_2407089;

public class Segitiga extends BangunDatar {
    private double alas, tinggi, sisiMiring;

    public Segitiga(String nama, double alas, double tinggi, double sisiMiring) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double hitungKeliling() {
        return alas + tinggi + sisiMiring;
    }
}