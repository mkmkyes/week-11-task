public class MobilOperasional extends Kendaraan {

    MobilOperasional(String nama, int kapasitas) {
        super(nama, kapasitas);
    }

    void bergerak() {
        System.out.println("Mobil operasional digunakan untuk staf kampus");
    }

    void info() {
        System.out.println("Mobil: " + nama + " | Kapasitas: " + kapasitas);
    }
} 
    

