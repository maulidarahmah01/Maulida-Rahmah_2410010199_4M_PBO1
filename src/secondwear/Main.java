package secondwear;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    // Object ArrayList
    static ArrayList<Baju> daftarBarang = new ArrayList<>();
    static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

    // Object Admin
    static Admin admin = new Admin("admin", "123", "Maulida");

    public static void main(String[] args) {

        login();

    }

    // ==========================
    // LOGIN ADMIN
    // ==========================
    static void login() {

        String username;
        String password;

        System.out.println("========================================");
        System.out.println(" SISTEM PENJUALAN SECONDWEAR PRELOVED ");
        System.out.println("========================================");

        System.out.print("Username : ");
        username = input.nextLine();

        System.out.print("Password : ");
        password = input.nextLine();

        if (admin.login(username, password)) {

            System.out.println("\nLogin Berhasil!");
            menuUtama();

        } else {

            System.out.println("\nUsername atau Password Salah!");

        }

    }

    // ==========================
    // MENU UTAMA
    // ==========================
    static void menuUtama() {

        int pilihan = 0;

        do {

            System.out.println("\n===============================");
            System.out.println("          MENU UTAMA");
            System.out.println("===============================");
            System.out.println("1. Kelola Barang");
            System.out.println("2. Transaksi");
            System.out.println("3. Laporan");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");

            try {

                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {

                    case 1:
                        menuBarang();
                        break;

                    case 2:
                        transaksi();
                        break;

                    case 3:
                        laporan();
                        break;

                    case 4:
                        System.out.println("\nTerima kasih telah menggunakan SecondWear.");
                        break;

                    default:
                        System.out.println("\nMenu tidak tersedia!");

                }

            } catch (InputMismatchException e) {

                System.out.println("\nInput harus berupa angka!");

                input.nextLine();

            }

        } while (pilihan != 4);

    }

    // ==========================
    // MENU BARANG
    // ==========================
    static void menuBarang() {

        int pilih = 0;

        do {

            System.out.println("\n===== KELOLA BARANG =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Barang");
            System.out.println("3. Kembali");
            System.out.print("Pilih : ");

            try {

                pilih = input.nextInt();
                input.nextLine();

                switch (pilih) {

                    case 1:
                        tambahBarang();
                        break;

                    case 2:
                        lihatBarang();
                        break;

                    case 3:
                        break;

                    default:
                        System.out.println("Menu tidak tersedia!");

                }

            } catch (InputMismatchException e) {

                System.out.println("Input harus angka!");
                input.nextLine();

            }

        } while (pilih != 3);

    }

    // ===========================================
    // METHOD DIISI PADA BAGIAN 2 DAN BAGIAN 3
    // ===========================================

static void tambahBarang() {

    try {

        System.out.println("\n===== TAMBAH BARANG =====");

        System.out.print("ID Barang           : ");
        String id = input.nextLine();

        System.out.print("Nama Barang         : ");
        String nama = input.nextLine();

        System.out.print("Kategori            : ");
        String kategori = input.nextLine();

        System.out.print("Brand               : ");
        String brand = input.nextLine();

        System.out.print("Ukuran              : ");
        String ukuran = input.nextLine();

        System.out.print("Warna               : ");
        String warna = input.nextLine();

        System.out.print("Kondisi             : ");
        String kondisi = input.nextLine();

        System.out.print("Harga               : ");
        double harga = input.nextDouble();

        System.out.print("Stok                : ");
        int stok = input.nextInt();
        input.nextLine();

        System.out.print("Jenis Baju          : ");
        String jenis = input.nextLine();

        Baju barang = new Baju(id, nama, kategori, brand,
                ukuran, warna, kondisi,
                harga, stok, jenis);

        daftarBarang.add(barang);

        System.out.println("\nData berhasil ditambahkan.");

    } catch (Exception e) {

        System.out.println("Terjadi kesalahan input.");
        input.nextLine();

    }

}
static void lihatBarang() {

    if (daftarBarang.isEmpty()) {

        System.out.println("\nBelum ada data barang.");

        return;

    }

    System.out.println("\n============= DATA BARANG =============");

    for (int i = 0; i < daftarBarang.size(); i++) {

        Baju barang = daftarBarang.get(i);

        System.out.println("-------------------------------------");
        System.out.println("Data ke-" + (i + 1));
        System.out.println("ID Barang      : " + barang.getIdBarang());
        System.out.println("Nama Barang    : " + barang.getNamaBarang());
        System.out.println("Kategori       : " + barang.getKategori());
        System.out.println("Brand          : " + barang.getBrand());
        System.out.println("Ukuran         : " + barang.getUkuran());
        System.out.println("Warna          : " + barang.getWarna());
        System.out.println("Kondisi        : " + barang.getKondisi());
        System.out.println("Jenis          : " + barang.getJenis());
        System.out.println("Harga          : " + barang.getHarga());
        System.out.println("Harga Diskon   : " + barang.hitungDiskon());
        System.out.println("Stok           : " + barang.getStok());

    }

}

static void transaksi() {

    if (daftarBarang.isEmpty()) {

        System.out.println("\nBelum ada barang yang tersedia.");
        return;

    }

    try {

        System.out.println("\n========== TRANSAKSI ==========");

        System.out.print("ID Transaksi : ");
        String id = input.nextLine();

        System.out.print("Nama Pembeli : ");
        String pembeli = input.nextLine();

        System.out.println("\nDaftar Barang");

        for (int i = 0; i < daftarBarang.size(); i++) {

            System.out.println((i + 1) + ". "
                    + daftarBarang.get(i).getNamaBarang()
                    + " | Rp " + daftarBarang.get(i).hitungDiskon());

        }

        System.out.print("Pilih Barang : ");
        int pilih = input.nextInt() - 1;
        input.nextLine();

        Baju barang = daftarBarang.get(pilih);

        System.out.println("\nPlatform Pembelian");
        System.out.println("1. Shopee");
        System.out.println("2. Manual");
        System.out.print("Pilih : ");
        int p = input.nextInt();
        input.nextLine();

        String platform;

        if (p == 1) {
            platform = "Shopee";
        } else {
            platform = "Manual";
        }

        System.out.println("\nMedia Promosi");
        System.out.println("1. TikTok");
        System.out.println("2. Instagram");
        System.out.print("Pilih : ");
        int m = input.nextInt();
        input.nextLine();

        String promosi;

        if (m == 1) {
            promosi = "TikTok";
        } else {
            promosi = "Instagram";
        }

        System.out.println("\nMetode Pengambilan");
        System.out.println("1. Ambil di Toko");
        System.out.println("2. Pick Up");
        System.out.print("Pilih : ");
        int a = input.nextInt();
        input.nextLine();

        String ambil;

        if (a == 1) {
            ambil = "Ambil di Toko";
        } else {
            ambil = "Pick Up";
        }

        System.out.print("Jumlah Beli : ");
        int jumlah = input.nextInt();
        input.nextLine();
        if (jumlah > barang.getStok()) {

    System.out.println("\nStok tidak mencukupi!");

    return;

}

        double total = barang.hitungDiskon() * jumlah;

        Transaksi trx = new Transaksi(
                id,
                pembeli,
                barang.getNamaBarang(),
                platform,
                promosi,
                ambil,
                jumlah,
                total);

daftarTransaksi.add(trx);

// Kurangi stok barang
barang.setStok(barang.getStok() - jumlah);

System.out.println("\nTransaksi berhasil disimpan.");
        System.out.println("Total Bayar : Rp " + total);

    } catch (Exception e) {

        System.out.println("Terjadi kesalahan input.");
        input.nextLine();

    }

}

static void laporan() {

    System.out.println("\n==============================");
    System.out.println("         LAPORAN");
    System.out.println("==============================");

    System.out.println("Jumlah Barang      : " + daftarBarang.size());

    System.out.println("Jumlah Transaksi   : " + daftarTransaksi.size());

    double pendapatan = 0;

    for (Transaksi t : daftarTransaksi) {

        pendapatan += t.getTotalHarga();

    }

    System.out.println("Total Pendapatan   : Rp " + pendapatan);

    System.out.println("\n========== DATA TRANSAKSI ==========");

    if (daftarTransaksi.isEmpty()) {

        System.out.println("Belum ada transaksi.");

    } else {

        for (Transaksi t : daftarTransaksi) {

            System.out.println("--------------------------------");
            System.out.println("ID Transaksi      : " + t.getIdTransaksi());
            System.out.println("Nama Pembeli      : " + t.getNamaPembeli());
            System.out.println("Nama Barang       : " + t.getNamaBarang());
            System.out.println("Platform          : " + t.getPlatform());
            System.out.println("Promosi           : " + t.getMediaPromosi());
            System.out.println("Pengambilan       : " + t.getMetodePengambilan());
            System.out.println("Jumlah            : " + t.getJumlah());
            System.out.println("Total Bayar       : Rp " + t.getTotalHarga());

        }

    }

}

}