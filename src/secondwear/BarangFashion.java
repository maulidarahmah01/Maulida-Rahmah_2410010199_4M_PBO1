package secondwear;

public class BarangFashion {

    // ==========================
    // Atribut (Encapsulation)
    // ==========================
    private String idBarang;
    private String namaBarang;
    private String kategori;
    private String brand;
    private String ukuran;
    private String warna;
    private String kondisi;
    private double harga;
    private int stok;

    // ==========================
    // Constructor Kosong
    // ==========================
    public BarangFashion() {

    }

    // ==========================
    // Constructor Berparameter
    // ==========================
    public BarangFashion(String idBarang, String namaBarang,
            String kategori, String brand,
            String ukuran, String warna,
            String kondisi, double harga, int stok) {

        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.kategori = kategori;
        this.brand = brand;
        this.ukuran = ukuran;
        this.warna = warna;
        this.kondisi = kondisi;
        this.harga = harga;
        this.stok = stok;

    }

    // ==========================
    // Getter
    // ==========================
    public String getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getKategori() {
        return kategori;
    }

    public String getBrand() {
        return brand;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getWarna() {
        return warna;
    }

    public String getKondisi() {
        return kondisi;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // ==========================
    // Setter
    // ==========================
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // Method yang nanti dioverride
    public double hitungDiskon() {
        return harga;
    }

}