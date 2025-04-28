package OOP.Kue;

abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    public String toString() {
        return "Nama      : " + nama + "\nHarga     : Rp" + String.format("%.2f", harga);
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}