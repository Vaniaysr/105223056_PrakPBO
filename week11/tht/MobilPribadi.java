package tht;

public class MobilPribadi extends Kendaraan implements DapatDisewa {
    public MobilPribadi(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 300000; // Contoh: 300rb/hari
    }

    @Override
    public boolean perluSupir() {
        return false; // Mobil pribadi tidak perlu supir
    }
}
