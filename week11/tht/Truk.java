package tht;

public class Truk extends Kendaraan implements DapatDisewa, Muatan {
    private double kapasitas; // dalam kg

    public Truk(String platNomor, String merk, int tahunProduksi, double kapasitas) {
        super(platNomor, merk, tahunProduksi);
        this.kapasitas = kapasitas;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * 800000; // Contoh: 800rb/hari
    }

    @Override
    public boolean perluSupir() {
        return true; // Truk butuh supir
    }

    @Override
    public double kapasitasMuatan() {
        return kapasitas;
    }
}
