package latihan_pbo.latihan3_2407089;

public class Main {
    
    public static void main(String[] args) {
        SegiTiga sTiga = new SegiTiga();
        JajarGenjang jGenjang = new JajarGenjang();

        sTiga.setAlas(2);
        sTiga.setTinggi(3);
        System.out.println("Luas Segitiga adalah : " + sTiga.LuasSegiTiga());

        jGenjang.setAlas(4);
        jGenjang.setTinggi(5);
        System.out.println("Luas Jajargenjang adalah : " + jGenjang.luasJajarGenjang());

        
    }
}
