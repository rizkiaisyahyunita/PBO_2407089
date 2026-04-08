public class BangunDatar {
    private int panjang;
    private int lebar;

    // constructor
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // method hitung luas
    public int hitungLuas() {
        return panjang * lebar;
    }
}