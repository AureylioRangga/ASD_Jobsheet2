public class Dosen07 {

    // atribut
    String  idDosen;
    String  nama;
    boolean statusAktif;
    int     tahunBergabung;
    String  bidangKeahlian;

    // konstruktor default
    public Dosen07() {
    }

    // konstruktor berparameter
    public Dosen07(String idDosen, String nama, boolean statusAktif,
                 int tahunBergabung, String bidangKeahlian) {
        this.idDosen        = idDosen;
        this.nama           = nama;
        this.statusAktif    = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // method tampilkan informasi 
    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    // method setStatusAktif
    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (status) {
            System.out.println(nama + " sekarang berstatus Aktif.");
        } else {
            System.out.println(nama + " sekarang berstatus Tidak Aktif.");
        }
    }

    // method hitung masa kerja
    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    // method ubah keahlian
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian diubah menjadi: " + bidangKeahlian);
    }
}