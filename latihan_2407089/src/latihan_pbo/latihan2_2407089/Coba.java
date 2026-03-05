package latihan_pbo.latihan2_2407089;

public class Coba {
    protected double panjang;
    protected double lebar;
    protected double sisi;

    //getter
    //setter
    public void setPanjang (double panjang){
        this.panjang = panjang;
    }

    public double getPanjang (){
        return panjang;
    }

    public void setLebar (double lebar){
        this.lebar = lebar;
    }

    public void cetakLuas(){
        System.out.println("Luasnya adalah : "+ (panjang * lebar));
    }

    public double hitungLuas(){
        double luas = panjang * lebar;
        return luas;
    }  
}
