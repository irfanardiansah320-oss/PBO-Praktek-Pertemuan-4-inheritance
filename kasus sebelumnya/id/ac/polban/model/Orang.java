package id.ac.polban.model;

public class Orang {
    private String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
    }
}