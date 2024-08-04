package main.java.com.careHubApps.model;

public class ObatModel {
    private String id;
    private String nama;
    private String kategori;
    private String exp;
    private int harga;
    private int stok;

    public ObatModel(String id, String nama, String kategori, String exp, int harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.exp = exp;
        this.harga = harga;
        this.stok = stok;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    
}
