package universitas;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private double ipk;

    public Mahasiswa(String nim, String nama, String prodi, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    public String getNIM() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public double getIPK() {
        return ipk;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public void tampilkanData() {
        System.out.println("--Data Mahasiswa--");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("IPK: " + ipk);
        System.out.println("------------------");
    }
}
