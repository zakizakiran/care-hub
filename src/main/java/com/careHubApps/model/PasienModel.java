package main.java.com.careHubApps.model;

public class PasienModel {
    private String id;
    private String nama;
    private String tglLahir;
    private String noTelpon;
    private String email;
    private String jenisKelamin;
    private String golDarah;
    private String dokter;

    public PasienModel(String id, String nama, String tglLahir, String noTelpon, String email, String jenisKelamin, String golDarah, String dokter) {
        this.id = id;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.noTelpon = noTelpon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
        this.golDarah = golDarah;
        this.dokter = dokter;
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

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getGolDarah() {
        return golDarah;
    }

    public void setGolDarah(String golDarah) {
        this.golDarah = golDarah;
    }

    public String getDokter() {
        return dokter;
    }

    public void setDokter(String dokter) {
        this.dokter = dokter;
    }

}