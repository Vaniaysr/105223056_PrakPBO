package tht;

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new MobilPribadi("B1234XYZ", "Toyota", 2021);
        Kendaraan bus = new Bus("D5678GHJ", "Mercedes", 2018);
        Truk truk = new Truk("E9101KLM", "Hino", 2020, 5000.0); // 5000 kg

        System.out.println("=== Mobil Pribadi ===");
        mobil.tampilkanInfo();
        System.out.println("Biaya Sewa (3 hari): " + mobil.hitungBiayaSewa(3));
        System.out.println("Perlu Supir? " + mobil.perluSupir());

        System.out.println("\n=== Bus ===");
        bus.tampilkanInfo();
        System.out.println("Biaya Sewa (2 hari): " + bus.hitungBiayaSewa(2));
        System.out.println("Perlu Supir? " + bus.perluSupir());

        System.out.println("\n=== Truk ===");
        truk.tampilkanInfo();
        System.out.println("Biaya Sewa (4 hari): " + truk.hitungBiayaSewa(4));
        System.out.println("Perlu Supir? " + truk.perluSupir());
        System.out.println("Kapasitas Muatan: " + truk.kapasitasMuatan() + " kg");
    }
}
