public class MataKuliah07 {

    // atribut
    String kodeMK;
    String nama;
    int    sks;
    int    jumlahJam;

    // Konstruktor default
    public MataKuliah07() {
    }

    // konstruktor berparameter
    public MataKuliah07(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK    = kodeMK;
        this.nama      = nama;
        this.sks       = sks;
        this.jumlahJam = jumlahJam;
    }

    // method tampilkan informasi
    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    // method ubah sks
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    // method tambah jam
    void tambahJam(int jam) {
        jumlahJam = jumlahJam + jam;
        System.out.println("Jam ditambah. Jumlah jam sekarang: " + jumlahJam);
    }

    // method kurangi jam
    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan.");
            System.out.println("Jumlah jam tidak mencukupi.");
        } else {
            jumlahJam = jumlahJam - jam;
            System.out.println("Jam dikurangi. Jumlah jam sekarang: " + jumlahJam);
        }
    }
}