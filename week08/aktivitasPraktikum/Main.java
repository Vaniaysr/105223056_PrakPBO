package aktivitasPraktikum;

class Kendaraan { // Super Class / Parent Class
    String merk = "Toyota";

    Kendaraan() {
        System.out.println("Ini constructor parent");
    }

    void jalan() {
        System.out.println("Kendaraan sedang berjalan");
    }
}

class Mobil extends Kendaraan { // Sub Class / Child Class
    String merk = "BMW";

    Mobil() {
        super();
        System.out.println("Ini constructor child");
    }

    void printlnfo() {
        System.out.println("merk mobil child " + merk);
        System.out.println("merk mobil parent " + super.merk);
        jalan();
    }
    
    void klakson(String merk) {
        System.out.println("Mobil " + super.merk + " Klakson");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Mobil jazz = new Mobil();
        // jazz.jalan();
        jazz.printlnfo();
        jazz.klakson("BMW");
        System.out.println(jazz.merk);
    }
}
