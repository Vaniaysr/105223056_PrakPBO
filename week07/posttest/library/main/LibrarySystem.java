package library.main;

import library.model.Book;
import library.model.Member;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void tambahBuku(Book b) {
        books.add(b);
        System.out.println("Buku berhasil ditambahkan!\n");
    }

    public void tambahMember(Member m) {
        members.add(m);
        System.out.println("Anggota berhasil ditambahkan!\n");
    }

    public void tampilkanBuku() {
        System.out.println("\nDaftar Buku: ");
        int jumlahBuku = 0;
        for (Book b : books) {
            System.out.println("- " + b.getTitle() + " oleh " + b.getAuthor() + " (" + b.getYearPublished() + ")");
            jumlahBuku++;
        }

        if (jumlahBuku == 0) {
            System.out.println("Belum ada buku yang ditambahkan. ");
        }

        System.out.println();
    }

    public void tampilkanAnggota() {
        System.out.println("\nDaftar Anggota: ");
        int jumlahAnggota = 0;
        for (Member m : members) {
            System.out.println("- " + m.getName() + " [ID: " + m.getMemberID() + "]");
            jumlahAnggota++;
        }

        if (jumlahAnggota == 0) {
            System.out.println("Belum ada anggota yang terdaftar.");
        }

        System.out.println();
    }
    
    public static void main(String[] args) throws Exception {
        LibrarySystem sistem = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Tampilkan Buku");
            System.out.println("4. Tampilkan Anggota");
            System.out.println("5. Keluar");
            System.out.println("Pilih: ");

            if(!scanner.hasNextInt()) {
                System.out.println("Pilihan tidak valid! Masukan angka 1 - 5\n");
                scanner.next();
                continue;
            }

            int pilihan = scanner.nextInt();
                scanner.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Judul Buku: ");
                    String title = scanner.nextLine(); 
                    System.out.println("Penulis: ");
                    String author = scanner.nextLine();
                    System.out.println("Tahun Terbit: ");
                    int yearPublished = Integer.parseInt(scanner.nextLine());
                    sistem.tambahBuku(new Book(title, author, yearPublished));
                    break;

                case 2:
                    System.out.println("Nama: ");
                    String name = scanner.nextLine(); 
                    System.out.println("Member ID: ");
                    String memberId = scanner.nextLine();
                    sistem.tambahMember(new Member(name, memberId));
                    break;
                
                case 3:
                    sistem.tampilkanBuku();
                    break;
                
                case 4:
                    sistem.tampilkanAnggota();
                    break;
                
                case 5:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Pilihan tidak valid! Silahkan pilih 1-5.");
            }
        }
    }
}
