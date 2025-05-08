package latihan.latihan2;

class Kendaraan {
    Kendaraan() {
        System.out.println("Konstruktor Kendaraan dipanggil");
    }
}

class Mobil extends Kendaraan {
    Mobil() {
        super();
        System.out.println("Konstruktor Mobil dipanggil");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
    }
}
