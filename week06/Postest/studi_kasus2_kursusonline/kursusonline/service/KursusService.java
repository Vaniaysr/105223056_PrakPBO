package kursusonline.service;

import kursusonline.model.Peserta;
import kursusonline.model.Kursus;
import java.util.ArrayList;

public class KursusService {
    private ArrayList<Kursus> daftarKursus;

    public KursusService() {
        daftarKursus = new ArrayList<>();
    }

    public void tambahKursus(Kursus k) {
        daftarKursus.add(k);
    }

    public Kursus cariKursusBerdasarkanKode(String kode) {
        for (Kursus k : daftarKursus) {
            if (k.getKode().equals(kode)) {
                return k;
            }
        }
        return null;
    }

    public void tambahPesertaKeKursus(String kodeKursus, Peserta peserta) {
        Kursus k = cariKursusBerdasarkanKode(kodeKursus);
        if (k != null) {
            k.tambahPeserta(peserta);
        }
    }

    public void tampilkanSemuaKursus() {
        for (Kursus k : daftarKursus) {
            k.tampilkanDetailKursus();
        }
    }
}