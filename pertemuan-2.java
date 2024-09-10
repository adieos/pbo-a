// Class
class Mobil {
    private int kecepatan; // Encapsulation

    public Mobil() {
        kecepatan = 0;
    }

    // Polymorphism melalui method overriding
    public void start() {
        System.out.println("Mobil mulai berjalan.");
    }

    // Overloading method untuk setKecepatan
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Nama method sama tetapi tipe data berbeda
    public void setKecepatan(float kecepatan) {
        this.kecepatan = (int) kecepatan;
    }

    public int getKecepatan() {
        return kecepatan;
    }
}

// Abstraction dan Inheritance
class MobilSport extends Mobil {
    @Override
  // Polymorphism
    public void start() {
        System.out.println("Mobil sport mulai berjalan dengan cepat.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Object
        Mobil mobil1 = new Mobil();
        mobil1.start();
        mobil1.setKecepatan(60);

        MobilSport mobilSport = new MobilSport();
        mobilSport.start();
        mobilSport.setKecepatan(120);

        System.out.println("Kecepatan mobil sport: " + mobilSport.getKecepatan() + " km/jam");
    }
}
