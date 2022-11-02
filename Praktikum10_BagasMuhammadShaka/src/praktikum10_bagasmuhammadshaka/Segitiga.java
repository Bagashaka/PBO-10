package praktikum10_bagasmuhammadshaka;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(){}
    
    public Segitiga(String warna,double alas,double tinggi){
    super(warna);
    this.alas = alas;
    this.tinggi = tinggi;
    }
    
    @Override
    public double Luas(){
    return 0.5*this.alas*this.tinggi;
    }
    
    @Override
    public double keliling(){
    return 3*this.alas;
    }
    
    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }    
}
