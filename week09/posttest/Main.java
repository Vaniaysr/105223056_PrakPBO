package posttest;

import java.util.Date;
import java.util.Calendar;

class Vehicle {
    public void startEngine() {
        System.out.println("Mesin Nyala");
    }
}

class Car extends Vehicle {
    public void startEngine() {
        System.out.println("Mesin Mobil Nyala");
    }
}

class Motorcycle extends Vehicle {
    public void startEngine() {
        System.out.println("Mesin Motor Nyala");
    }
}

class License {
    private static int counter = 1000;
    private int licenseNumber;
    private Date validUntil;

    public License() {
        this.licenseNumber = counter++;

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 5);
        this.validUntil = calendar.getTime();
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public Date getValidUntil() {
        return validUntil;
    }
}

class Driver {
    private String name;
    private Vehicle vehicle;
    private License license;

    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
        this.license = new License();
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pengemudi: " + name);

        System.out.print("Jenis Kendaraan: ");
        if (vehicle instanceof Car) {
            System.out.println("Mobil");
        } else if (vehicle instanceof Motorcycle) {
            System.out.println("Motor");
        } else {
            System.out.println("Tidak Diketahui");
        }

        System.out.print("Status Mesin: ");
        vehicle.startEngine();

        System.out.println("Nomor Lisensi: " + license.getLicenseNumber());
        System.out.println("Lisensi Berlaku Hingga: " + license.getValidUntil());
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Andi", new Car());
        Driver driver2 = new Driver("Rina", new Motorcycle());

        driver1.tampilkanInfo();
        driver2.tampilkanInfo();
    }
}
