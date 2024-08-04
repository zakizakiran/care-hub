package main.java.com.careHubApps.model;

public class DokterModel {
    private String id;
    private String nama;
    private String spesialis;
    private String noTelpon;
    private String alamat;

    public DokterModel(String id, String nama, String spesialis, String noTelpon, String alamat) {
        this.id = id;
        this.nama = nama;
        this.spesialis = spesialis;
        this.noTelpon = noTelpon;
        this.alamat = alamat;
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

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
