package aktivitasPraktikum.binding;

class Animal {
    static void suara() {
        System.out.println("Suara hewan");
    }
    
    void makan() {
        System.out.println("Hewan makan");
    }
}

class Dog extends Animal {
    @Override
    void makan() {
        System.out.println("Anjing makan daging");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Animal a = new Animal();
        // a.suara();

        Animal.suara(); // Static (gaperlu buat object dari class animal)
        a.makan(); // Dynamic static

        Animal b = new Dog();

        b.makan(); // Dynamic binding
    }
}
