public class Percobaan3 {

    public static void main(String[] args) {

        Mahasiswa07 mhs1 = new Mahasiswa07("Muhammad Ali Farhan", "2441720171", 3.55, "SI 2J");
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2441720171";
        mhs1.kelas = "SI 2J"; 
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa07 mhs2 = new Mahasiswa07("Annisa Nabila","2141720160",3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa07 mhs3 = new Mahasiswa07("Aureylio Rangga","244107060163",3.5,"SIB 1E");
        mhs3.updateIpk(3.5);
        mhs3.tampilkanInformasi();
        
    }
}