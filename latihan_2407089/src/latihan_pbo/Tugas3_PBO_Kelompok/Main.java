package latihan_pbo.Tugas3_PBO_Kelompok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cafe cafe = new Cafe("Cafe Santai");

        // Tambah menu
        cafe.tambahMenu(new Makanan("Nasi Goreng", 12000));
        cafe.tambahMenu(new Makanan("Mie Ayam", 10000));
        cafe.tambahMenu(new Minuman("Es Teh", 5000));
        cafe.tambahMenu(new Minuman("Kopi", 8000));

        int pilihan;
        double total = 0;

        do {
            cafe.tampilkanMenu();
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            if (pilihan > 0 && pilihan <= cafe.getJumlahMenu()) {

                Menu m = cafe.getMenu(pilihan - 1);

                //  makanan → pilih jenis
                if (m instanceof Makanan) {
                    System.out.println("Pilih jenis:");
                    System.out.println("1. Pedas");
                    System.out.println("2. Tidak Pedas");
                    System.out.print("Pilihan: ");
                    int jenis = input.nextInt();

                    if (jenis == 1) {
                        ((Makanan) m).setJenis("Pedas");
                    } else {
                        ((Makanan) m).setJenis("Tidak Pedas");
                    }
                }

                //  minuman → pilih ukuran + harga berubah
                if (m instanceof Minuman) {
                    System.out.println("Pilih ukuran:");
                    System.out.println("1. Small");
                    System.out.println("2. Medium (+2000)");
                    System.out.println("3. Large (+4000)");
                    System.out.print("Pilihan: ");
                    int ukuran = input.nextInt();

                    if (ukuran == 1) {
                        ((Minuman) m).setUkuran("Small");
                    } else if (ukuran == 2) {
                        ((Minuman) m).setUkuran("Medium");
                    } else {
                        ((Minuman) m).setUkuran("Large");
                    }
                }

                System.out.print("Jumlah beli: ");
                int jumlah = input.nextInt();

                double subtotal = m.getHarga() * jumlah;
                total += subtotal;

                System.out.println("Subtotal: " + subtotal);
                System.out.println("Ditambahkan ke pesanan!");
            } 
            else if (pilihan != 0) {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        System.out.println("\nTotal bayar: " + total);
    }
}