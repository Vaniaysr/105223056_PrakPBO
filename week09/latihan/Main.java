package latihan;

import java.util.Date;

class Animal {
    protected HealthRecord healthRecord;

    public Animal() {
        this.healthRecord = new HealthRecord();
    }

    public void makeSound() {
        System.out.println("Hewan bersuara...");
    }

    public HealthRecord getHealthRecord() {
        return healthRecord;
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Guk-Guk!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meong!");
    }
}

class HealthRecord {
    private static int counter = 1000;
    private int recordNumber;
    private Date creationDate;

    public HealthRecord() {
        this.recordNumber = counter++;
        this.creationDate = new Date();
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}

class Owner {
    private String name;
    private Animal pet;

    public Owner(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public Animal getPet() {
        return pet;
    }

    public void tampilkanInfo() {
        System.out.println("Pemilik: " + name);
        System.out.print("Suara hewan peliharaan: ");
        pet.makeSound();

        if (pet instanceof Dog) {
            System.out.println("Jenis hewan: Dog");
        } else if (pet instanceof Cat) {
            System.out.println("Jenis hewan: Cat");
        } else {
            System.out.println("Jenis hewan: Tidak diketahui");
        }

        HealthRecord record = pet.getHealthRecord();
        System.out.println("Nomor Rekam Medis: " + record.getRecordNumber());
        System.out.println("Tanggal Rekam Medis: " + record.getCreationDate());
        System.out.println("---------------------------");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Budi", new Dog());
        Owner owner2 = new Owner("Sari", new Cat());

        owner1.tampilkanInfo();
        owner2.tampilkanInfo();
    }
}