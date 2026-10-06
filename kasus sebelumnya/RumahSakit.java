import id.ac.polban.model.Dokter;
import id.ac.polban.model.Pasien;
import id.ac.polban.service.PemeriksaanService;

public class RumahSakit {
    public static void main(String[] args) {
        System.out.println("Selamat datang di Rumah Sakit\n");

        Pasien pasien1 = new Pasien("Zaki", "RM001", 21);
        Pasien pasien2 = new Pasien("Reza", "RM002", 20);

        Dokter dokter1 = new Dokter("Sahizidan", "Penyakit dalam");
        Dokter dokter2 = new Dokter("Wildan", "Anak");
        
        PemeriksaanService service = new PemeriksaanService();

        service.tambahDokter(dokter1);
        service.tambahDokter(dokter2);
        service.tambahPasien(pasien1);
        service.tambahPasien(pasien2);

        service.lakukanPemeriksaan(dokter1, pasien1, 150000);
        service.lakukanPemeriksaan(dokter2, pasien2, 120000);

        pasien1.setUmur(35);
        pasien2.setUmur(-2);

        System.out.println("- Data Pasien -");

        pasien1.tampilkanInfo();
        pasien2.tampilkanInfo();

        System.out.println("- Data Dokter -");

        dokter1.tampilkanInfo();
        dokter2.tampilkanInfo();

        System.out.println("Total pemeriksaan yang dilakukan: " + PemeriksaanService.getJumlahPemeriksaan());

    }
}