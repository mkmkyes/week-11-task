class SepedaListrik extends Kendaraan {

    SepedaListrik(String nama, int kapasitas) {
        super(nama, kapasitas);
    }

    void bergerak() {
        System.out.println("Sepeda listrik berjalan tanpa polusi");
    }

    void info() {
        System.out.println("Sepeda: " + nama + " | Kapasitas: " + kapasitas);
    }
}