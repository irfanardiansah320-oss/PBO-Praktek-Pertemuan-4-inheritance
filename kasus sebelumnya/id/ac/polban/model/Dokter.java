package id.ac.polban.model;

public class Dokter extends Orang {
    private String spesialisasi;

    public Dokter(String namaDokter, String spesialisasi) {
        super(namaDokter);
        this.spesialisasi = spesialisasi;
    }

    public String getNamaDokter() {
        return getNama();
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void periksaPasien(Pasien p, int biayaPeriksa) {
        System.out.println("Dr " + getNama() + "(" + spesialisasi + ") memeriksa " + p.getNamaPasien());
        p.tambahTagihan(biayaPeriksa);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Spesialisasi : " + spesialisasi);
        System.out.println("-------------------------------");
    }
}