package posttest.soal2;

class Orang {
    Orang(){
        System.out.println("Orang dibuat!");
    }
}

class Dosen extends Orang {
    Dosen() {
        super();
        System.out.println("Dosen dibuat!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
    }
}
