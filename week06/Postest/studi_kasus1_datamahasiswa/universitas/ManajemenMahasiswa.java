package universitas;

import java.util.ArrayList;

public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private boolean dataTersedia = false;

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
        dataTersedia = true;
        System.out.println("Data berhasil ditambahkan!");
    }

    public void tampilkanSemua() {
        if (!dataTersedia) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            System.out.println("DAFTAR MAHASISWA: ");
            for (Mahasiswa m : daftarMahasiswa) {
                m.tampilkanData();
            }
        }
    }

    public void tampilkanIPKTertinggi() {
        if (!dataTersedia) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            Mahasiswa tertinggi = daftarMahasiswa.get(0);
            for (Mahasiswa m : daftarMahasiswa) {
                if (m.getIPK() > tertinggi.getIPK()) {
                    tertinggi = m;
                }
            }

            System.out.println("Mahasiswa IPK Tertinggi: ");
            tertinggi.tampilkanData();
        }
    }
}
