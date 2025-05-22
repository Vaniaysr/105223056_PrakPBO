package posttest;

class Employee {
    public double calculateSalary() {
        System.out.println("Hitung Gaji Karyawan");
        return 0.0;
    }

    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 10000000;
        } else {
            return calculateSalary();
        }
    }
}

class SoftwareEngineer extends Employee {
    @Override
    public double calculateSalary() {
        return 1000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 20000000;
        } else {
            return calculateSalary();
        }
    }
}

class DataScientist extends Employee {
    @Override
    public double calculateSalary() {
        return 1200000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 25000000;
        } else {
            return calculateSalary();
        }
    }
}

class Intern extends Employee {
    @Override
    public double calculateSalary() {
        return 3000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        if (withBonus) {
            return calculateSalary() + 250000;
        } else {
            return calculateSalary();
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Employee emp1 = new SoftwareEngineer();
        Employee emp2 = new DataScientist();
        Employee emp3 = new Intern();

        System.out.println("Gaji Dasar Karyawan:");
        System.out.println("- SoftwareEngineer: Rp" + emp1.calculateSalary());
        System.out.println("- DataScientist: Rp" + emp2.calculateSalary());
        System.out.println("- Intern: Rp" + emp3.calculateSalary());

        System.out.println("\nGaji dengan Bonus:");
        SoftwareEngineer se = new SoftwareEngineer();
        DataScientist ds = new DataScientist();
        Intern in = new Intern();

        System.out.println("- SoftwareEngineer: Rp" + se.calculateSalary(true));
        System.out.println("- DataScientist: Rp" + ds.calculateSalary(true));
        System.out.println("- Intern: Rp" + in.calculateSalary(true));
    }
}
