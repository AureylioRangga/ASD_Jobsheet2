public class MataKuliahMain07 {

    public static void main(String[] args) {

        // Objek 1 - konstruktor default
        MataKuliah07 mk1 = new MataKuliah07();
        mk1.kodeMK    = "TI2143";
        mk1.nama      = "Algoritma dan Struktur Data";
        mk1.sks       = 3;
        mk1.jumlahJam = 4;

        System.out.println("=== Mata Kuliah 1 ===");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.kurangiJam(10); // uji kondisi jam tidak mencukupi

        // Objek 2 - konstruktor Berparameter
        MataKuliah07 mk2 = new MataKuliah07("TI2144", "Basis Data", 3, 3);

        System.out.println("\n=== Mata Kuliah 2 ===");
        mk2.tampilInformasi();
        mk2.tambahJam(1);
        mk2.ubahSKS(2);
    }
}