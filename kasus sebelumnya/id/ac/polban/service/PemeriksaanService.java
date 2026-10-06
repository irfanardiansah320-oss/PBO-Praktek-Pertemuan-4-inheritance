package id.ac.polban.service;

import id.ac.polban.model.Dokter;
import id.ac.polban.model.Pasien;
import java.util.ArrayList;
import java.util.List;

public class PemeriksaanService {

    private List<Dokter> daftarDokter;
    private List<Pasien> daftarPasien;

    private static int jumlahPemeriksaan = 0;

    public PemeriksaanService() {
        this.daftarDokter = new ArrayList<>();
        this.daftarPasien = new ArrayList<>();
    }

    public void tambahDokter(Dokter d) {
        daftarDokter.add(d);
    }

    public void tambahPasien(Pasien p) {
        daftarPasien.add(p);
    }

    public void lakukanPemeriksaan(Dokter dokter, Pasien pasien, int biaya) {
        dokter.periksaPasien(pasien, biaya);
        jumlahPemeriksaan++;
    }

    public static int getJumlahPemeriksaan() {
        return jumlahPemeriksaan;
    }

    public List<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    public List<Pasien> getDaftarPasien() {
        return daftarPasien;
    }
}