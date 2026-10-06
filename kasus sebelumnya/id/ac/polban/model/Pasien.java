package id.ac.polban.model;

public class Pasien extends Orang {
    private String nomorRekamMedis;
    private int umur;
    private int tagihan;

    public Pasien(String namaPasien, String nomorRekamMedis, int umur) {
        super(namaPasien);
        this.nomorRekamMedis = nomorRekamMedis;
        this.umur = umur;
        this.tagihan = 0;
    }

    public String getNamaPasien() {
        return getNama();
    }

    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }

    public int getUmur() {
        return umur;
    }

    public int getTagihan() {
        return tagihan;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid \n");
        }
    }

    public void tambahTagihan(int biaya) {
        if (biaya > 0) {
            this.tagihan += biaya;
        }
    }

     @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("No. RM : " + nomorRekamMedis);
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("Total Tagihan : Rp" + tagihan);
        System.out.println("-------------------------------");
    }
}