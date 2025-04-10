package utama;

import java.util.ArrayList;
import dosen.Dosen;
import mahasiswa.Mahasiswa;
import matakuliah.MataKuliah;

public class Utama {

    public static void main(String[] args) {
        
        Dosen dosen1 = new Dosen("Cahya", "001");
        Dosen dosen2 = new Dosen("Budi", "002");

        Mahasiswa mhs1 = new Mahasiswa("Tiara", "CS101");
        Mahasiswa mhs2 = new Mahasiswa("Diana", "CS102");

        MataKuliah mk1 = new MataKuliah("PBO", "123");
        ArrayList<Dosen> pengampu1 = new ArrayList<>();
        pengampu1.add(dosen1);
        mk1.setPengampu(pengampu1);
        ArrayList<Mahasiswa> mahasiswa1 = new ArrayList<>();
        mahasiswa1.add(mhs1);
        mahasiswa1.add(mhs2);
        mk1.setDaftarMahasiswa(mahasiswa1);

        MataKuliah mk2 = new MataKuliah("Kompar", "124");
        ArrayList<Dosen> pengampu2 = new ArrayList<>();
        pengampu2.add(dosen2);
        mk2.setPengampu(pengampu2);
        ArrayList<Mahasiswa> mahasiswa2 = new ArrayList<>();
        mahasiswa2.add(mhs1);
        mahasiswa2.add(mhs2);
        mk2.setDaftarMahasiswa(mahasiswa2);

        MataKuliah mk3 = new MataKuliah("Metnum", "125");
        ArrayList<Dosen> pengampu3 = new ArrayList<>();
        pengampu3.add(dosen2);
        mk3.setPengampu(pengampu3);
        ArrayList<Mahasiswa> mahasiswa3 = new ArrayList<>();
        mahasiswa3.add(mhs1);
        mk3.setDaftarMahasiswa(mahasiswa3);

        System.out.println("------------------------------------------------------------------");
        System.out.printf("| %-12s | %-17s | %-10s | %-14s |\n", "Mata Kuliah", "Kode Mata Kuliah", "Pengampu", "Mahasiswa");
        System.out.println("------------------------------------------------------------------");
        tampilkanData(mk1);
        tampilkanData(mk2);
        tampilkanData(mk3);
        System.out.println("------------------------------------------------------------------");
    }

    public static void tampilkanData(MataKuliah matakuliah) {
        String nama = matakuliah.getNama();
        String kodeMK = matakuliah.getKodeMK();

        String pengampu = "";
        ArrayList<Dosen> daftarDosen = matakuliah.getPengampu();
        for (int i = 0; i < daftarDosen.size(); i++) {
            pengampu += daftarDosen.get(i).getNama();
            if (i < daftarDosen.size() - 1) {
                pengampu += ", ";
            }
        }

        String mahasiswa = "";
        ArrayList<Mahasiswa> daftarMahasiswa = matakuliah.getDaftarMahasiswa();
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            mahasiswa += daftarMahasiswa.get(i).getNama();
            if (i < daftarMahasiswa.size() - 1) {
                mahasiswa += ", ";
            }
        }

        System.out.printf("| %-12s | %-17s | %-10s | %-14s |\n", nama, kodeMK, pengampu, mahasiswa);
    }
}
