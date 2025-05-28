package tht;

import tht.Transportasi;

public class Main {
    public static void main(String[] args) {
        Transportasi[] daftarTransportasi = new Transportasi[3];
        daftarTransportasi[0] = new Bus("Bus", 40, "Bandung");
        daftarTransportasi[1] = new Kereta("Kereta", 200, "Surabaya");
        daftarTransportasi[2] = new Pesawat("Pesawat", 100, "Medan");

        for (Transportasi t : daftarTransportasi) {
            String tujuan = t.getTujuan();
            String nama = t.getNama();

            System.out.println(nama + " ke " + tujuan + " - Harga tiket (default): " + t.hitungHargaTiket());

            if (t instanceof Bus) {
                System.out.println(nama + " ke " + tujuan + " - Harga tiket (Bisnis): " + t.hitungHargaTiket("Bisnis"));
            } else if (t instanceof Kereta) {
                System.out.println(nama + " ke " + tujuan + " - Harga tiket (VIP): " + t.hitungHargaTiket("VIP"));
            } else if (t instanceof Pesawat) {
                System.out.println(nama + " ke " + tujuan + " - Harga tiket (Ekonomi): " + t.hitungHargaTiket("Ekonomi"));
            }

            System.out.println();
        }
    }
}

