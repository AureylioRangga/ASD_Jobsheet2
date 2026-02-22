public class DosenMain07 {

    public static void main(String[] args) {

        // Objek 1 - konstruktor default
        Dosen07 dsn1 = new Dosen07();
        dsn1.idDosen        = "D001";
        dsn1.nama           = "Dr. Budi Santoso";
        dsn1.statusAktif    = true; 
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Jaringan Komputer";

        System.out.println("=== Info Dosen 1 ===");
        dsn1.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.ubahKeahlian("Keamanan Jaringan");
        dsn1.setStatusAktif(false);

        // Objek 2 - konstruktor berparameter
        Dosen07 dsn2 = new Dosen07("D002", "Siti Rahayu, M.Kom",
                               true, 2015, "Rekayasa Perangkat Lunak");

        System.out.println("\n=== Info Dosen 2 ===");
        dsn2.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
        dsn2.setStatusAktif(true);
    }
}