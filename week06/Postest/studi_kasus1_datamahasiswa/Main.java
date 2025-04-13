import universitas.Mahasiswa;
import universitas.ManajemenMahasiswa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();
        
        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiwa dengan IPK Tertinggi" );
            System.out.println("4. Keluar");
            System.out.println("Pilih : ");
            int opsi;

            if (!scanner.hasNextInt() || (opsi = scanner.nextInt()) < 1 || opsi > 4) {
                System.out.println("Pilihan tidak valid! Masukkan angka 1 - 4.");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();


            switch (opsi) {
                case 1 :
                    System.out.println("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.println("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.println("Masukkan Prodi: ");
                    String prodi = scanner.nextLine();

                    double ipk;
                    while (true) {
                    System.out.print("Masukkan IPK: ");
                        ipk = scanner.nextDouble();
                        scanner.nextLine();
                        if (ipk >= 0.0 && ipk <= 4.0) {
                            break;
                        } else {
                            System.out.println("IPK harus antara 0.00 hingga 4.00");
                        }
                    }

                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, ipk);
                    manajemen.tambahMahasiswa(m);
                    break;
                case 2 :
                    manajemen.tampilkanSemua();
                    break;
                case 3 :
                    manajemen.tampilkanIPKTertinggi();
                    break;
                case 4 :
                    System.out.println("Terima kasih!");
                    return;
                default :
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
