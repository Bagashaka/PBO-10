package praktikum10_bagasmuhammadshaka;

public class segiempat extends BangunDatar {
    private double sisi;

    public segiempat(){}
    
    public segiempat(String warna,double sisi){
    super(warna);
    this.sisi = sisi;
    }
    
    @Override
    public double Luas(){
    return this.sisi  * this.sisi;
    }
    
    @Override
    public double keliling(){
    return 4*this.sisi;
    }
    
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
