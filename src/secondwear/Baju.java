package secondwear;

public class Baju extends BarangFashion {

    // Atribut tambahan
    private String jenis;

    // Constructor kosong
    public Baju() {

    }

    // Constructor berparameter
    public Baju(String idBarang, String namaBarang,
            String kategori, String brand,
            String ukuran, String warna,
            String kondisi, double harga,
            int stok, String jenis) {

        super(idBarang, namaBarang, kategori,
                brand, ukuran, warna,
                kondisi, harga, stok);

        this.jenis = jenis;

    }

    // Getter
    public String getJenis() {
        return jenis;
    }

    // Setter
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Polymorphism (Override)
    @Override
    public double hitungDiskon() {

        return getHarga() * 0.90;

    }

}