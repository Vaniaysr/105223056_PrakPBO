package tht;

public class Bus extends Transportasi {

    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.10;
    }

    @Override
    public double hitungHargaTiket(String kelasLayanan) {
        double harga = hitungHargaTiket();
        switch (kelasLayanan.toLowerCase()) {
            case "bisnis":
                harga *= 1.25;
                break;
            case "vip":
                harga *= 1.5;
                break;
            case "ekonomi":
            default:
                break;
        }
        return harga;
    }
}
