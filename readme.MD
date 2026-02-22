Percobaan 1

1. Sebutkan dua karakteristik class atau object!
   Jawab :
   Memiliki atribut (property/data)
   - yaitu variabel yang menyimpan data dari object
     contoh: nim, nama, kelas, ipk
   Memiliki method (perilaku/fungsi)
   - yaitu fungsi yang dapat dilakukan object 
     contoh: tampilkanInformasi(), ubahKelas()

2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh    
   class Mahasiswa? Sebutkan apa saja atributnya!
   Jawab : 
   Ada 4 atribut
   yaitu:
   -nim (String)
   -nama (String)
   -kelas (String)
   -ipk (double)

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
   Jawab :
   Ada 4 method
   yaitu:
   - tampilkanInformasi()
   - ubahKelas()
   - updateIpk()
   - nilaiKinerja()

4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method
   tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah
   IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak
   pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
   Jawab :
   Sudah dimodifikasi
   - mengecek : 0.0 sampai 4.0
   - Jika salah tampil : IPK tidak valid. Harus antara 0.0 dan 4.0

5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,
   kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang
   dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
   Jawab :
   Method ini digunakan untuk menentukan nilai kinerja mahasiswa berdasarkan IPK.
   Kriteria:
   IPK ≥ 3.5 = Sangat Baik
   IPK ≥ 3.0 = Baik
   IPK ≥ 2.5 = Cukup
   IPK < 2.5 = Kurang
   
   Yang dikembalikan : String nilai kinerja

6. Commit dan push kode program ke Github
   Jawab : Sudah


PERCOBAAN 2

1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses
   instansiasi! Apa nama object yang dihasilkan?
   Jawab : Mahasiswa07 mhs1 = new Mahasiswa07();
           - nama object = mhs1

2. Bagaimana cara mengakses atribut dan method dari suatu objek?
   Jawab : Menggunakan tanda titik (.)
           contoh: mhs1.nama = "Aureylio";
                   mhs1.tampilkanInformasi();

3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
   Jawab : Karena nilai kelas dan IPK sudah diubah menggunakan method:
           contoh: 
           sebelum: kelas = TI1
           sesudah: kelas = TI2
           jadi output berubah


PERCOBAAN 3

1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
   mendeklarasikan konstruktor berparameter!
   Jawab : Mahasiswa(String nim, String nama, String kelas, double ipk){
           this.nim = nim;
           this.nama = nama;
           this.kelas = kelas;
           this.ipk = ipk;
           }   

2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program
   berikut?
   Jawab : Baris ini membuat object baru menggunakan konstruktor

3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program.
   Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
   Jawab : Program akan Error, Karena object tanpa parameter tidak bisa dibuat
           Contoh: Mahasiswa mhs1 = new Mahasiswa();
                   tidak bisa digunakan

4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses
   secara berurutan? Jelaskan alasannya!
   Jawab : Tidak, Method bisa dipanggil bebas
           contoh: mhs1.updateIpk(3.5);
                   mhs1.tampilkanInformasi();
           
5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor
   berparameter dari class Mahasiswa!
   Jawab : Sudah 

6. Commit dan push kode program ke Github
   Jawab : Sudah

