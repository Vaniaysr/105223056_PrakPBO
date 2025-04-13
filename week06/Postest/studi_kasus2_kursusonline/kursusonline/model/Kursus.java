package kursusonline.model;

import java.util.ArrayList;

public class Kursus {
    private String kode;
    private String nama;
    private Instruktur instruktur;
    private ArrayList<Peserta> daftarPeserta;
    private ArrayList<Materi> daftarMateri;

    public Kursus(String kode, String nama, Instruktur instruktur) {
        this.kode = kode;
        this.nama = nama;
        this.instruktur = instruktur;
        this.daftarPeserta = new ArrayList<>();
        this.daftarMateri = new ArrayList<>();
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public void tambahPeserta(Peserta p) {
        boolean sudahAda = false;
        for (Peserta peserta : daftarPeserta) {
            if (peserta.getID().equals(p.getID())) {
                sudahAda = true;
                break;
            }
        }

        if (!sudahAda && p.getEmail().endsWith("@gmail.com")) {
            daftarPeserta.add(p);
        }
    }

    public void tambahMateri(Materi m) {
        daftarMateri.add(m);
    }

    public void tampilkanDetailKursus() {
        System.out.println("Kursus: " + nama + " (" + kode + ")");
        System.out.println("Instruktur: " + instruktur.getNama());
        System.out.println("Materi:");
        for (Materi m : daftarMateri) {
            System.out.println("- " + m.getJudul() + " (" + m.getDurasi() + " menit)");
        }
        System.out.println("Peserta:");
        for (Peserta p : daftarPeserta) {
            System.out.println("- " + p.getNama() + " | Email: " + p.getEmail());
        }
        System.out.println("====================================");
    }
}