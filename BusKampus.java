class BusKampus extends Kendaraan {

    BusKampus(String nama, int kapasitas) {
        super(nama, kapasitas);
    }

    void bergerak() {
        System.out.println("Bus kampus berjalan mengangkut mahasiswa");
    }

    void info() {
        System.out.println("Bus: " + nama + " | Kapasitas: " + kapasitas);
    }
}