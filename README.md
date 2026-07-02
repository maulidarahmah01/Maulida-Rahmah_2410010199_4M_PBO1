# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini merupakan aplikasi sederhana berbasis Java yang dibuat sebagai tugas akhir mata kuliah Pemrograman Berorientasi Objek 1.

## Deskripsi

Program yang dibuat berjudul **SecondWear – Sistem Penjualan Baju Preloved**.

Aplikasi ini digunakan untuk membantu admin dalam mengelola penjualan baju preloved. Program menyediakan fitur login admin, pengelolaan data barang, transaksi penjualan, serta laporan hasil penjualan.

Program dibuat menggunakan bahasa pemrograman **Java** dengan IDE **Apache NetBeans**.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam Pemrograman Berorientasi Objek (PBO) seperti Class, Object, Attribute, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, ArrayList, dan Error Handling.

---

# Penjelasan Kode

## 1. Class

Class merupakan blueprint atau cetakan dari sebuah object.

Pada program ini terdapat lima class yaitu:

- BarangFashion
- Baju
- Admin
- Transaksi
- Main

```java
public class BarangFashion {

}

public class Baju extends BarangFashion {

}

public class Admin {

}

public class Transaksi {

}

public class Main {

}
```

---

## 2. Object

Object merupakan hasil pembuatan dari sebuah class.

Pada program ini object digunakan untuk membuat data admin, barang fashion, dan transaksi.

```java
Admin admin = new Admin("admin", "123", "Administrator");

Baju barang = new Baju(
        id,
        nama,
        kategori,
        brand,
        ukuran,
        warna,
        kondisi,
        harga,
        stok,
        jenis
);

Transaksi transaksi = new Transaksi(
        idTransaksi,
        namaPembeli,
        namaBarang,
        platform,
        mediaPromosi,
        metodePengambilan,
        jumlah,
        totalHarga
);
```

---

## 3. Attribute

Attribute merupakan variabel yang dimiliki oleh sebuah class.

Contoh attribute pada class BarangFashion.

```java
private String idBarang;
private String namaBarang;
private String kategori;
private String brand;
private String ukuran;
private String warna;
private String kondisi;
private double harga;
private int stok;
```

---

## 4. Constructor

Constructor adalah method yang pertama kali dijalankan ketika object dibuat.

Pada program ini constructor terdapat pada class `BarangFashion`, `Baju`, `Admin`, dan `Transaksi`.

Contoh constructor pada class `BarangFashion`.

```java
public BarangFashion() {

}

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
```

---

## 5. Mutator

Mutator atau Setter digunakan untuk mengubah nilai dari suatu attribute.

Contoh setter pada class `BarangFashion`.

```java
public void setNamaBarang(String namaBarang) {
    this.namaBarang = namaBarang;
}

public void setHarga(double harga) {
    this.harga = harga;
}

public void setStok(int stok) {
    this.stok = stok;
}
```

---

## 6. Accessor

Accessor atau Getter digunakan untuk mengambil nilai dari suatu attribute.

Contoh getter pada class `BarangFashion`.

```java
public String getNamaBarang() {
    return namaBarang;
}

public double getHarga() {
    return harga;
}

public int getStok() {
    return stok;
}
```

---

## 7. Encapsulation

Encapsulation adalah konsep menyembunyikan data dengan membuat attribute menjadi `private` dan hanya dapat diakses melalui method getter dan setter.

Contohnya terdapat pada class `BarangFashion`.

```java
private String namaBarang;

public String getNamaBarang() {
    return namaBarang;
}

public void setNamaBarang(String namaBarang) {
    this.namaBarang = namaBarang;
}
```

Dengan cara tersebut data menjadi lebih aman karena tidak dapat diakses secara langsung dari luar class.

---

## 8. Inheritance

Inheritance adalah konsep pewarisan dari class induk ke class turunan.

Pada program ini class `Baju` mewarisi class `BarangFashion` menggunakan keyword `extends`.

```java
public class Baju extends BarangFashion {

}
```

Dengan inheritance, class `Baju` dapat menggunakan attribute dan method yang sudah dimiliki oleh `BarangFashion` tanpa perlu menuliskannya kembali.

ArrayList<Baju>
ArrayList<Transaksi>

---

# UML Class Diagram

Program ini menggunakan lima class utama, yaitu:

- BarangFashion
- Baju
- Admin
- Transaksi
- Main

Hubungan inheritance terdapat pada class **Baju** yang mewarisi class **BarangFashion** menggunakan keyword `extends`.

Diagram UML dapat dilihat pada file berikut:

```
UML_Class_Diagram_SecondWear.png
```

---

# Fitur Program

Program **SecondWear** memiliki beberapa fitur utama, yaitu:

- Login Admin
- Menambah Data Barang
- Melihat Data Barang
- Melakukan Transaksi Penjualan
- Menghitung Harga Setelah Diskon
- Mengurangi Stok Barang Setelah Transaksi
- Menampilkan Laporan Penjualan

---

# Cara Menjalankan Program

1. Jalankan file `Main.java`.
2. Login menggunakan username dan password admin.
3. Pilih menu yang tersedia.
4. Tambahkan data barang.
5. Lakukan transaksi penjualan.
6. Lihat laporan penjualan.
7. Pilih menu keluar untuk mengakhiri program.

---

# Usulan Nilai

| No | Materi | Nilai |
| :-: | ---------------- | :---: |
| 1 | Class | 5 |
| 2 | Object | 5 |
| 3 | Attribute | 5 |
| 4 | Constructor | 5 |
| 5 | Mutator | 5 |
| 6 | Accessor | 5 |
| 7 | Encapsulation | 5 |
| 8 | Inheritance | 5 |
| 9 | Polymorphism | 10 |
| 10 | Seleksi | 5 |
| 11 | Perulangan | 5 |
| 12 | IO Sederhana | 10 |
| 13 | Array | 15 |
| 14 | Error Handling | 15 |
| | **TOTAL** | **100** |

---

# Pembuat

**Nama** : Maulida Rahmah

**NPM** : 2410010199

**Kelas** : 4M Reguler Pagi

**Mata Kuliah** : Pemrograman Berorientasi Objek 1

---

# Penutup

Program **SecondWear – Sistem Penjualan Baju Preloved** berhasil dibuat dengan menerapkan konsep-konsep dasar Pemrograman Berorientasi Objek, yaitu Class, Object, Attribute, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, ArrayList, dan Error Handling.

Program ini masih dapat dikembangkan lebih lanjut, misalnya dengan menggunakan database sebagai media penyimpanan data atau menambahkan tampilan berbasis GUI agar lebih interaktif dan mudah digunakan.
