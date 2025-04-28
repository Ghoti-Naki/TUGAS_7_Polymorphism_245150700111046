package OOP.Kue;

class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double hitungHarga() {
        return getHarga() * jumlah * 2;
    }

    public double getJumlah() {
        return jumlah;
    }
}