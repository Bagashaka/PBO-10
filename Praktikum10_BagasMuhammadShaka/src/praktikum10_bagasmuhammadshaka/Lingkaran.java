package praktikum10_bagasmuhammadshaka;


public class Lingkaran extends BangunDatar {
    private double jari;
    
    public Lingkaran(){
    }
    public Lingkaran(String warna,double jari){
        super(warna);
        this.jari = jari;
    }
   
    @Override
    public double Luas(){
        return Math.PI * this.jari *this.jari;
    }
    
    @Override
    public double keliling(){
        return 2*Math.PI*this.jari;
    }
    
    public double getJari(){
        return jari;
    }
    
    public void setJari(double jari){
    this.jari = jari;
    }
}
