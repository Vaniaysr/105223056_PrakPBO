package latihan;

class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Proses pembayaran sebesar " + amount);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Proses pembayaran sebesar " + amount + "dalam mata uang " + currency);
    }
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pembayaran dengan Kartu Kredit sebesar " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Pembayaran dengan Kartu Kredit sebesar " + amount + "dalam mata uang " + currency);
    }
}

class Ewallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pembayaran dengan E-Wallet sebesar " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Pembayaran dengan E-Wallet sebesar " + amount + "dalam mata uang " + currency);
    }
}

class TransferBank extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Transfer Bank sebesar " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Transfer Bank sebesar " + amount + "dalam mata uang " + currency);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        PaymentMethod m1 = new CreditCard();
        PaymentMethod m2 = new Ewallet();
        PaymentMethod m3 = new TransferBank();

        m1.processPayment(50000);
        m2.processPayment(50000);
        m3.processPayment(50000);

        System.out.println();

        m1.processPayment(100, "USD");
        m2.processPayment(200000, "IDR");
        m3.processPayment(150, "EUR");
    }
}
