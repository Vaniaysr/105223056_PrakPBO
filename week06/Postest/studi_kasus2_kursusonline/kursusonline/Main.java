package kursusonline;

import kursusonline.model.Instruktur;
import kursusonline.model.Peserta;
import kursusonline.model.Materi;
import kursusonline.model.Kursus;
import kursusonline.service.KursusService;

public class Main {
    public static void main(String[] args) {
        Instruktur i1 = new Instruktur("I001", "Budi", "Java");
        Instruktur i2 = new Instruktur("I002", "Siti", "Web");

        Kursus k1 = new Kursus("K001", "Java Dasar", i1);
        Kursus k2 = new Kursus("K002", "HTML CSS", i2);

        Peserta p1 = new Peserta("P001", "Andi", "andi@gmail.com", "08123456789");
        Peserta p2 = new Peserta("P002", "Rina", "rina@gmail.com", "08198765432");
        Peserta p3 = new Peserta("P003", "Dodi", "dodiyahoo.com", "08192837465");

        Materi m1 = new Materi("Intro Java", "Dasar Java", 60);
        Materi m2 = new Materi("Variabel", "Belajar variabel", 45);
        Materi m3 = new Materi("HTML Tags", "Belajar HTML", 40);

        k1.tambahMateri(m1);
        k1.tambahMateri(m2);
        k2.tambahMateri(m3);

        KursusService ks = new KursusService();
        ks.tambahKursus(k1);
        ks.tambahKursus(k2);

        ks.tambahPesertaKeKursus("K001", p1);
        ks.tambahPesertaKeKursus("K001", p3);
        ks.tambahPesertaKeKursus("K002", p2);

        ks.tampilkanSemuaKursus();
    }
}