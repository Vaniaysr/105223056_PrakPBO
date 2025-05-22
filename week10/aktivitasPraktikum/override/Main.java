package aktivitasPraktikum.override;
class Animal {
    public void suara() {
        System.out.println("Cetak Suara");
    }

    public void makan (String lauk) {
        System.out.println("Hewan makan " + lauk);
    }
}

class Dog extends Animal {
    @Override
    public void suara() {
        System.out.println("GUK GUK GUK");
    }

    public void makan(String lauk, String minuman) {
        System.out.println("Hewan makan " + lauk + " dan Minum" + minuman);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Animal a = new Animal();
        a.suara();

        Animal d = new Dog();
        d.suara();
        d.makan("Ayam Goreng"); //method dari parent
    }
}
