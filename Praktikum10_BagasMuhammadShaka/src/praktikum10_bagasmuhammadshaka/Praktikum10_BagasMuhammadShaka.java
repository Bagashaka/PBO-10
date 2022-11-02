package praktikum10_bagasmuhammadshaka;

public class Praktikum10_BagasMuhammadShaka {

    public static void main(String[] args) {
//     BangunDatar bd = new BangunDatar("Hitam");
//     System.out.println("Warna bangun datar: " + bd.getWarna());
//     System.out.println();
//     
//     Lingkaran ln = new Lingkaran("Merah",26.0);
//     System.out.println("Luas Lingkaran: "+ ln.Luas());
//     System.out.println("Keliling Lingkaran: "+ln.keliling());
//     System.out.println();
//     
//     Segitiga st = new Segitiga("Ungu",15,7);
//     System.out.println("Luas Segitiga :"+st.Luas());
//     System.out.println("Keliling Segitiga: "+st.keliling());
//     System.out.println();
//     
//     segiempat se = new segiempat("Kuning",10);
//     System.out.println("Luas Segiempat :"+se.Luas());
//     System.out.println("Keliling Segiempat: "+se.keliling());
//     System.out.println();
     
     
     BangunDatar bd = new BangunDatar("Hitam");
     System.out.println("Warna bangun datar: " + bd.getWarna());
     System.out.println();
     
     BangunDatar ln = new Lingkaran("Merah",26.0);
     System.out.println("Luas Lingkaran: "+ String.format("2%f",ln.Luas()));
     System.out.println("Keliling Lingkaran: "+String.format("2%f",ln.keliling()));
     System.out.println();
     
     BangunDatar st = new Segitiga("Ungu",15,7);
     System.out.println("Luas Segitiga :"+st.Luas());
     System.out.println("Keliling Segitiga: "+st.keliling());
     System.out.println();
     
     BangunDatar se = new segiempat("Kuning",10);
     System.out.println("Luas Segiempat :"+se.Luas());
     System.out.println("Keliling Segiempat: "+se.keliling());
     System.out.println();
    }   
}
