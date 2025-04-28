package OOP.Kue;

public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];

        daftarKue[0] = new KuePesanan("Kue Lapis", 50000, 2);
        daftarKue[1] = new KuePesanan("Kue Tart", 70000, 1.5);
        daftarKue[2] = new KuePesanan("Kue Nastar", 60000, 2.5);
        daftarKue[3] = new KuePesanan("Kue Putri Salju", 55000, 1.8);
        daftarKue[4] = new KuePesanan("Kue Kering", 65000, 2.2);
        daftarKue[5] = new KuePesanan("Kue Black Forest", 90000, 1.2);
        daftarKue[6] = new KuePesanan("Kue Soes", 40000, 2);
        daftarKue[7] = new KuePesanan("Kue Opera", 85000, 1.3);
        daftarKue[8] = new KuePesanan("Kue Red Velvet", 75000, 1.7);
        daftarKue[9] = new KuePesanan("Kue Sagu", 48000, 2.4);
        daftarKue[10] = new KueJadi("Kue Brownies", 15000, 5);
        daftarKue[11] = new KueJadi("Kue Muffin", 8000, 12);
        daftarKue[12] = new KueJadi("Kue Cupcake", 10000, 6);
        daftarKue[13] = new KueJadi("Kue Donat", 7000, 10);
        daftarKue[14] = new KueJadi("Kue Bolu", 12000, 4);
        daftarKue[15] = new KueJadi("Kue Pastel", 5000, 20);
        daftarKue[16] = new KueJadi("Kue Eclair", 9500, 7);
        daftarKue[17] = new KueJadi("Kue Cheesecake", 17000, 3);
        daftarKue[18] = new KueJadi("Kue Macaron", 20000, 2);
        daftarKue[19] = new KueJadi("Kue Chiffon", 13000, 5);

//------a. Tampilkan semua kue dan harus ditampilkan jenis kuenya-------------------------------------------------------------------------------

        System.out.println("============== Daftar Semua Kue ==============");
        int no = 1;
        for (Kue kue : daftarKue) {
            String jenis = (kue instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
            System.out.println("------------------------------------------");
            System.out.println("No        : " + no++);
            System.out.println("Jenis     : " + jenis);
            System.out.println(kue.toString());
        
            if (kue instanceof KuePesanan) {
                System.out.printf("Berat     : %.1f kg\n", ((KuePesanan) kue).getBerat());
            } else if (kue instanceof KueJadi) {
                System.out.println("Jumlah    : " + ((KueJadi) kue).getJumlah() + " pcs");
            }
        
            System.out.printf("Total     : Rp%.2f\n", kue.hitungHarga());
        }
        System.out.println("------------------------------------------");

//------b. Hitung total harga yang didapat dari semua jenis kue-------------------------------------------------------------------------

        double totalHargaSemua = 0;
        for (Kue kue : daftarKue) {
            totalHargaSemua += kue.hitungHarga();
        }
        System.out.println("\n========= Total Harga Semua Kue =========");
        System.out.printf("Total Harga Semua Kue    : Rp%.2f\n", totalHargaSemua);

//------c. Hitung total harga dan total berat dari KuePesanan--------------------------------------------------------------------------------

        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("\n========= Ringksan Kue Pesanan =========");
        System.out.printf("Total Harga Kue Pesanan  : Rp%.2f\n", totalHargaPesanan);
        System.out.printf("Total Berat Kue Pesanan  : %.2f kg\n", totalBeratPesanan);

//------d. Hitung total harga dan total jumlah dari KueJadi---------------------------------------------------------------------------

        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("\n========= Ringkasan Kue Jadi =========");
        System.out.printf("Total Harga Kue Jadi     : Rp%.2f\n", totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi    : " + (int) totalJumlahJadi + " pcs");

//-----e. Tampilkan informasi kue dengan harga (harga akhir) terbesar------------------------------------------------------------------

        Kue kueTermahal = daftarKue[0];
        for (Kue kue : daftarKue) {
            if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }
        System.out.println("\n==== Kue dengan Harga Akhir Terbesar ====");
        System.out.println("------------------------------------------");
        System.out.println("Nama Kue  : " + kueTermahal.getNama());
        System.out.println("Jenis     : " + (kueTermahal instanceof KuePesanan ? "Kue Pesanan" : "Kue Jadi"));

        if (kueTermahal instanceof KuePesanan) {
            System.out.printf("Berat     : %.2f kg\n", ((KuePesanan) kueTermahal).getBerat());
        } else if (kueTermahal instanceof KueJadi) {
            System.out.println("Jumlah    : " + ((KueJadi) kueTermahal).getJumlah() + " pcs");
        }

        System.out.printf("Total     : Rp%.2f\n", kueTermahal.hitungHarga());
        System.out.println("------------------------------------------");
    }
}