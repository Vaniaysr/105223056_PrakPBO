package latihan.abstrak;

public class Main {
    public static void main(String[] args) throws Exception {
        Kucing k = new Kucing("KUCING");
        Anjing a = new Anjing("dog");

        // Hewan h = new Hewan();

        k.makan();
        k.bersuara();

        a.makan();
        a.bersuara();
    }
}
