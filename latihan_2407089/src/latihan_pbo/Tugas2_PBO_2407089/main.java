public class main {
    public static void main(String[] args) {
        // buat objek
        BangunRuang br = new BangunRuang(10, 5, 4);

        // tampilkan hasil
        System.out.println("Luas: " + br.hitungLuas());
        System.out.println("Volume: " + br.hitungVolume());
    }
}