package latihan_pbo.Tugas3_PBO_Kelompok;

import java.util.ArrayList;

public class Cafe {
    private String namaCafe;
    private ArrayList<Menu> daftarMenu;

    public Cafe(String namaCafe) {
        this.namaCafe = namaCafe;
        daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public void tampilkanMenu() {
        System.out.println("\n=== Menu " + namaCafe + " ===");
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarMenu.get(i).detailMenu();
        }
    }

    public Menu getMenu(int index) {
        return daftarMenu.get(index);
    }

    public int getJumlahMenu() {
        return daftarMenu.size();
    }
}