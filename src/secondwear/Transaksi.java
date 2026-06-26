package secondwear;

public class Transaksi {

    // Attribute
    private String idTransaksi;
    private String namaPembeli;
    private String namaBarang;
    private String platform;
    private String mediaPromosi;
    private String metodePengambilan;
    private int jumlah;
    private double totalHarga;

    // Constructor kosong
    public Transaksi() {

    }

    // Constructor berparameter
    public Transaksi(String idTransaksi, String namaPembeli,
            String namaBarang, String platform,
            String mediaPromosi, String metodePengambilan,
            int jumlah, double totalHarga) {

        this.idTransaksi = idTransaksi;
        this.namaPembeli = namaPembeli;
        this.namaBarang = namaBarang;
        this.platform = platform;
        this.mediaPromosi = mediaPromosi;
        this.metodePengambilan = metodePengambilan;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;

    }

    // Getter
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getPlatform() {
        return platform;
    }

    public String getMediaPromosi() {
        return mediaPromosi;
    }

    public String getMetodePengambilan() {
        return metodePengambilan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    // Setter
    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setMediaPromosi(String mediaPromosi) {
        this.mediaPromosi = mediaPromosi;
    }

    public void setMetodePengambilan(String metodePengambilan) {
        this.metodePengambilan = metodePengambilan;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

}