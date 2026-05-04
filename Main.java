public class Main {
    public static void main(String[] args) {

        Kendaraan[] daftarKendaraan = new Kendaraan[4];

        daftarKendaraan[0] = new BusKampus("Bus A", 40);
        daftarKendaraan[1] = new MobilOperasional("Mobil Dinas", 5);
        daftarKendaraan[2] = new SepedaListrik("Sepeda Eco", 2);

        // Anonymous Class
        daftarKendaraan[3] = new Kendaraan("Kendaraan Khusus", 10) {
            void bergerak() {
                System.out.println("Kendaraan khusus bergerak fleksibel");
            }

            void info() {
                System.out.println("Kendaraan Khusus | Kapasitas: " + kapasitas);
            }
        };

        // Polymorphism
        for (Kendaraan k : daftarKendaraan) {
            k.info();
            k.bergerak();
            System.out.println("----------------------");
        }
    }
}