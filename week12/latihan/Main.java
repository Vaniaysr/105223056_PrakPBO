package latihan;

import java.util.Scanner;

public class Main {
    private static final String[] VALID_BOOK_IDS = {"B001", "B002", "B003"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan nama Anda: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan ID buku: ");
            String idBuku = scanner.nextLine();
            if (!isValidBookId(idBuku)) {
                throw new InvalidBookIdException("ID buku tidak ditemukan dalam sistem.");
            }

            System.out.print("Masukkan lama peminjaman (hari): ");
            int lamaPinjam = scanner.nextInt();
            if (lamaPinjam < 1 || lamaPinjam > 14) {
                throw new InvalidLoanDurationException("Lama peminjaman harus antara 1 - 14 hari.");
            }

            System.out.println("\nPeminjaman berhasil diproses.");
            System.out.println("Nama: " + nama);
            System.out.println("ID Buku: " + idBuku);
            System.out.println("Lama Peminjaman: " + lamaPinjam + " hari");

        } catch (InvalidBookIdException | InvalidLoanDurationException e) {
            System.out.println("\nException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nTerjadi kesalahan input. Pastikan semua data valid.");
        } finally {
            scanner.close();
            System.out.println("Program selesai.");
        }
    }

    private static boolean isValidBookId(String id) {
        for (String validId : VALID_BOOK_IDS) {
            if (validId.equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
}
